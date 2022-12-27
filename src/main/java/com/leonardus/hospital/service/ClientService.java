package com.leonardus.hospital.service;

import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.repository.ClientRepository;
import com.leonardus.hospital.service.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        this.sortByHigherHealthRisk(clients);
        return clients.subList(0, Math.min(clients.size(), 10));
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

    private void sortByHigherHealthRisk(List<Client> clients){
        for (int i = 0; i < clients.size() - 1; i++){
            for (int j = i + 1; j < clients.size(); j++){
                if(clients.get(i).riskCoefficient() < clients.get(j).riskCoefficient()){
                    Client temp = clients.get(i);
                    clients.set(i, clients.get(j));
                    clients.set(j, temp);
                }
            }
        }
    }

}
