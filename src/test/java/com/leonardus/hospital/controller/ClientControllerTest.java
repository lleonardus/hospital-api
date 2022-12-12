package com.leonardus.hospital.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.factory.ClientFactory;
import com.leonardus.hospital.service.ClientService;
import com.leonardus.hospital.service.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@WebMvcTest(ClientController.class)
class ClientControllerTest {
    @MockBean
    ClientService service;

    @MockBean
    ModelMapper mapper;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    Client client;
    ClientDTO clientDTO;
    List<Client> clients;

    @BeforeEach
    void setUp() {
        client = ClientFactory.createClient();
        clientDTO = ClientFactory.createClientDTO();
        clients = ClientFactory.createClientList();

        when(service.findAll()).thenReturn(clients);
        when(service.higherHealthRisk()).thenReturn(clients);
        when(service.findById(1L)).thenReturn(client);
        when(service.create(clientDTO)).thenReturn(client);
        when(service.update(1L, clientDTO)).thenReturn(client);

        when(mapper.map(any(Client.class), any())).thenReturn(clientDTO);
    }

    @Test
    void findAll_ReturnsAListOfClientDTOs() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/clients").contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void higherHealthRisk_ReturnsAListOfClientDTOs() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/clients/higher-health-risk")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findById_WhenSuccessful_ReturnsAClientDTO() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/clients/{id}", 1L)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findById_WhenNotSuccessful_ThrowsAnObjectNotFoundException() throws Exception{
        doThrow(ObjectNotFoundException.class).when(service).findById(1L);

        mockMvc.perform(MockMvcRequestBuilders.get("/clients/{id}", 1L)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void create_ReturnsAClientDTO() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/clients")
                        .content(objectMapper.writeValueAsString(clientDTO))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.header().exists("Location"))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void update_WhenSuccessful_ReturnsAClientDTO() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.put("/clients/{id}", 1L)
                        .content(objectMapper.writeValueAsString(clientDTO))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void update_WhenNotSuccessful_ThrowsAnObjectNotFoundException() throws Exception{
        doThrow(ObjectNotFoundException.class).when(service).update(1L, clientDTO);

        mockMvc.perform(MockMvcRequestBuilders.put("/clients/{id}", 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(clientDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
}