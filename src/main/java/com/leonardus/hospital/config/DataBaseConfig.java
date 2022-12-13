package com.leonardus.hospital.config;

import com.leonardus.hospital.entities.Client;
import com.leonardus.hospital.entities.Disease;
import com.leonardus.hospital.entities.enums.Gender;
import com.leonardus.hospital.repository.ClientRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
@Log4j2
public class DataBaseConfig {

    public static final String DISEASE = "diabetes";

    @Bean
    CommandLineRunner initDataBase(ClientRepository repository){
        Date date = new Date();

        Client c11 = Client.builder().name("Client - 15").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c9 = Client.builder().name("Client - 14").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c7 = Client.builder().name("Client - 13").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c5 = Client.builder().name("Client - 12").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c3 = Client.builder().name("Client - 11").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c1 = Client.builder().name("Client - 10").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c13 = Client.builder().name("Client - 9").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c15 = Client.builder().name("Client - 8").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c2 = Client.builder().name("Client - 7").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c4 = Client.builder().name("Client - 6").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c6 = Client.builder().name("Client - 5").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c8 = Client.builder().name("Client - 4").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c10 = Client.builder().name("Client - 3").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c12 = Client.builder().name("Client - 2").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1),
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c14 = Client.builder().name("Client - 1").birthday(date)
                .diseases(List.of(
                        new Disease(null, DISEASE, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        repository.saveAll(List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15));

        return args -> log.info("H2 database started successfully");
    }
}
