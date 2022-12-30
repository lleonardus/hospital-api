package com.leonardus.hospital.service;

import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.repository.ClientRepository;
import com.leonardus.hospital.service.comparator.ClientHealthRiskComparator;
import com.leonardus.hospital.service.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;

    @Autowired
    ModelMapper mapper;

    public List<Client> findAll(){return repository.findAll();}

    public List<Client> higherHealthRisk(){
        List<Client> clients = repository.findAll();
        Comparator<Client> clientComparator = new ClientHealthRiskComparator();

        return clients.stream().sorted(clientComparator.reversed())
                .limit(10)
                .toList();
    }

    public Client findById(Long id){
        return repository.findById(id).orElseThrow(ObjectNotFoundException::new);
    }

    public Client create(ClientDTO clientDTO){
        Client client = mapper.map(clientDTO, Client.class);

        return repository.save(client);
    }

    public Client update(Long id, ClientDTO clientDTO){
        Client client = this.findById(id);
        client.setName(clientDTO.getName());
        client.setBirthday(clientDTO.getBirthday());
        client.setGender(clientDTO.getGender());

        return repository.save(client);
    }
}
