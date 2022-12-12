package com.leonardus.hospital.factory;

import com.leonardus.hospital.dtos.ClientDTO;
import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.entities.Disease;
import com.leonardus.hospital.entities.enums.Gender;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientFactory {

    public static Client createClient(){
        return Client.builder()
                .id(1L)
                .name("name")
                .birthday(new Date())
                .gender(Gender.MALE)
                .diseases(List.of(
                        new Disease(1L, "disease 1", 1),
                        new Disease(2L, "disease 2", 2)
                ))
                .build();
    }

    public static ClientDTO createClientDTO(){
        return new ModelMapper().map(createClient(), ClientDTO.class);
    }

    public static ArrayList<Client> createClientList(){
        Client c1 = Client.builder()
                .name("Third")
                .birthday(new Date())
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .diseases(List.of(
                        new Disease(null, "disease 1", 1)
                ))
                .build();

        Client c2 = Client.builder()
                .name("Second")
                .birthday(new Date())
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .diseases(List.of(
                        new Disease(null, "disease 1", 1),
                        new Disease(null, "disease 1", 1)
                ))
                .build();

        Client c3 = Client.builder()
                .name("First")
                .birthday(new Date())
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .diseases(List.of(
                        new Disease(null, "disease 1", 1),
                        new Disease(null, "disease 2", 2)
                ))
                .build();

        return new ArrayList<>(List.of(c2,c1,c3));
    }
}
