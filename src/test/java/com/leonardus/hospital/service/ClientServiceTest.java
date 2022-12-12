package com.leonardus.hospital.service;

import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.entities.enums.Gender;
import com.leonardus.hospital.factory.ClientFactory;
import com.leonardus.hospital.repository.ClientRepository;
import com.leonardus.hospital.service.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class ClientServiceTest {

    @InjectMocks
    ClientService service;

    @Mock
    ClientRepository repository;

    @Mock
    ModelMapper mapper;

    Client client;
    ClientDTO clientDTO;
    List<Client> clients;

    @BeforeEach
    void setUp() {
        client = ClientFactory.createClient();
        clientDTO = ClientFactory.createClientDTO();
        clients = ClientFactory.createClientList();

        when(repository.findAll()).thenReturn(clients);
        when(repository.findById(anyLong())).thenReturn(Optional.of(client));
        when(repository.save(client)).thenReturn(client);

        when(mapper.map(clientDTO, Client.class)).thenReturn(client);
    }

    @Test
    void findAll_ReturnsAListOfClients() {
        List<Client> response = service.findAll();

        assertNotNull(response);
        assertEquals(clients, response);
    }

    @Test
    void higherHealthRisk_ReturnsAListOfClientsSortedByHealthRisk() {
        List<Client> response = service.higherHealthRisk();

        assertNotNull(response);
        assertEquals(clients.size(), response.size());
        assertEquals("First", response.get(0).getName());
        assertEquals("Second", response.get(1).getName());
        assertEquals("Third", response.get(2).getName());
    }

    @Test
    void findById_WhenSuccessful_ReturnsAClient() {
        Client response = service.findById(1L);

        assertNotNull(response);
        assertEquals(client, response);
    }

    @Test
    void findById_WhenNotSuccessful_ThrowsAnObjectNotFoundException() {
        when(repository.findById(anyLong())).thenReturn(Optional.empty());

        assertThrows(ObjectNotFoundException.class, () -> service.findById(1L));
    }

    @Test
    void create_ReturnsAClient() {
        Client response = service.create(clientDTO);

        assertNotNull(response);
        assertEquals(client, response);
    }

    @Test
    void update_WhenSuccessful_ReturnsAClient() {
        Date birthday = new Date();
        clientDTO.setName("new name");
        clientDTO.setBirthday(birthday);
        clientDTO.setGender(Gender.FEMALE);

        Client response = service.update(1L, clientDTO);

        assertNotNull(response);
        assertEquals("new name", response.getName());
        assertEquals(birthday, response.getBirthday());
        assertEquals(Gender.FEMALE, response.getGender());
    }

    @Test
    void update_WhenNotSuccessful_ThrowsAnObjectNotFoundException() {
        when(repository.findById(anyLong())).thenReturn(Optional.empty());

        assertThrows(ObjectNotFoundException.class, () -> service.update(1L, clientDTO));
    }
}