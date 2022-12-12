package com.leonardus.hospital.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class DiseaseDTO {
    private Long id;
    private String name;
    private Integer degree;
}
