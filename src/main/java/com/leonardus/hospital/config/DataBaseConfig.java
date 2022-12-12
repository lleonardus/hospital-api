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

    public static final String DOENCA = "doença 1";

    @Bean
    CommandLineRunner initDataBase(ClientRepository repository){
        Date date = new Date();

        Client c11 = Client.builder().name("Primeiro - 15").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c9 = Client.builder().name("Segundo - 14").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c7 = Client.builder().name("Terceiro - 13").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c5 = Client.builder().name("Quarto - 12").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c3 = Client.builder().name("Quinto - 11").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c1 = Client.builder().name("Sexto - 10").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c13 = Client.builder().name("Sétimo - 9").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c15 = Client.builder().name("Oitavo - 8").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c2 = Client.builder().name("Nono - 7").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c4 = Client.builder().name("Décimo - 6").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c6 = Client.builder().name("Décimo primeiro - 5").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c8 = Client.builder().name("Décimo segundo - 4").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c10 = Client.builder().name("Décimo terceiro - 3").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c12 = Client.builder().name("Décimo quarto - 2").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1),
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        Client c14 = Client.builder().name("Décimo quinto - 1").birthday(date)
                .diseases(List.of(
                        new Disease(null, DOENCA, 1)
                ))
                .gender(Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE)
                .build();

        repository.saveAll(List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15));

        return args -> log.info("Banco de dados iniciado");
    }
}
