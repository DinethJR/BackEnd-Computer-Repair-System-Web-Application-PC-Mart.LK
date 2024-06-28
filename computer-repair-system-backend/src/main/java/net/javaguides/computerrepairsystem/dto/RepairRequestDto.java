package net.javaguides.computerrepairsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RepairRequestDto {
    private Long id;
    private String customerName;
    private String device;
    private String issue;
}
