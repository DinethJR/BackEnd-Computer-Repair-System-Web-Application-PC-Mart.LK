package net.javaguides.computerrepairsystem.mapper;

import net.javaguides.computerrepairsystem.dto.RepairRequestDto;
import net.javaguides.computerrepairsystem.entity.RepairRequest;

public class RepairRequestMapper {

    public static RepairRequestDto mapToRepairRequestDto (RepairRequest repairRequest){
        return new RepairRequestDto(
                repairRequest.getId(),
                repairRequest.getCustomerName(),
                repairRequest.getDevice(),
                repairRequest.getIssue()
        );
    }

    public static RepairRequest mapToRepairRequest(RepairRequestDto repairRequestDto){
        return new RepairRequest(
                repairRequestDto.getId(),
                repairRequestDto.getCustomerName(),
                repairRequestDto.getDevice(),
                repairRequestDto.getIssue()
        );
    }
}
