package net.javaguides.computerrepairsystem.service;

import net.javaguides.computerrepairsystem.dto.RepairRequestDto;

import java.util.List;

public interface RepairRequestService {
    RepairRequestDto createRepairRequest(RepairRequestDto repairRequestDto);

    RepairRequestDto getRepairRequestById(Long repairrequestId);

    List<RepairRequestDto> getAllRepairRequest();

    RepairRequestDto updateRepairRequest(Long repairrequestId, RepairRequestDto updateRepairRequest);

    void deleteRepairRequest (Long repairrequestId);
}
