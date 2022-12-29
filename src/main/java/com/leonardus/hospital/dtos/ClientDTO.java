package com.leonardus.hospital.dtos;

import com.leonardus.hospital.entities.enums.Gender;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor

public class ClientDTO {
    private Long id;
    private String name;
    private Date birthday;
    private Gender gender;
    @Valid
    private Set<DiseaseDTO> diseases;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
