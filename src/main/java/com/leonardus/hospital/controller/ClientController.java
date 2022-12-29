package com.leonardus.hospital.controller;

import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.service.ClientService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService service;
    @Autowired
    ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll(){
        List<Client> clients = service.findAll();

        return ResponseEntity.ok().body(clients.stream().map(client -> mapper.map(client, ClientDTO.class)).toList());
    }

    @GetMapping("/higher-health-risk")
    public ResponseEntity<List<ClientDTO>> higherHealthRisk(){
        List<Client> clients = service.higherHealthRisk();

        return ResponseEntity.ok().body(clients.stream().map(client -> mapper.map(client, ClientDTO.class)).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
        Client client = service.findById(id);

        return ResponseEntity.ok().body(mapper.map(client, ClientDTO.class));
    }

    @PostMapping
    public ResponseEntity<ClientDTO> create(@Valid @RequestBody ClientDTO clientDTO){
        Client client = service.create(clientDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(client.getId()).toUri();

        return ResponseEntity.created(uri).body(mapper.map(client, ClientDTO.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable Long id, @Valid @RequestBody ClientDTO clientDTO){
        Client client = service.update(id, clientDTO);

        return ResponseEntity.ok().body(mapper.map(client, ClientDTO.class));
    }

}
