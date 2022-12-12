package com.leonardus.hospital.dtos;

import com.leonardus.hospital.entities.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {
    private Long id;
    private String name;
    private Date birthday;
    private Gender gender;
    private Set<DiseaseDTO> diseases;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
