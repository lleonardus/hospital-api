package com.leonardus.hospital.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiseaseDTO {
    private Long id;
    private String name;
    @Min(value = 1, message = "The minimum value of the degree of a disease is 1")
    @Max(value = 2, message = "The maximum value of the degree of a disease is 2")
    private Integer degree;
}
