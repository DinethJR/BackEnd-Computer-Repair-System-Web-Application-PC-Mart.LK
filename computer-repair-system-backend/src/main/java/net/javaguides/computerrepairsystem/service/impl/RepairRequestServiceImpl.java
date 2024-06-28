package net.javaguides.computerrepairsystem.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.computerrepairsystem.dto.RepairRequestDto;
import net.javaguides.computerrepairsystem.entity.RepairRequest;
import net.javaguides.computerrepairsystem.exception.ResourceNotFoundException;
import net.javaguides.computerrepairsystem.mapper.RepairRequestMapper;
import net.javaguides.computerrepairsystem.repository.RepairRequestRepository;
import net.javaguides.computerrepairsystem.service.RepairRequestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RepairRequestServiceImpl implements RepairRequestService {

    private RepairRequestRepository repairRequestRepository;

    @Override
    public RepairRequestDto createRepairRequest(RepairRequestDto repairRequestDto) {

        RepairRequest repairRequest = RepairRequestMapper.mapToRepairRequest(repairRequestDto);
        RepairRequest savedRepairRequest =repairRequestRepository.save(repairRequest);

        return RepairRequestMapper.mapToRepairRequestDto(savedRepairRequest);
    }

    @Override
    public RepairRequestDto getRepairRequestById(Long repairrequestId) {
        RepairRequest repairRequest = repairRequestRepository.findById(repairrequestId)
                .orElseThrow(() -> new ResourceNotFoundException("Repair Request is not exists with given id : "+repairrequestId));
        return RepairRequestMapper.mapToRepairRequestDto(repairRequest);
    }

    @Override
    public List<RepairRequestDto> getAllRepairRequest() {
        List<RepairRequest> repairRequests = repairRequestRepository.findAll();
        return repairRequests.stream().map((repairRequest) -> RepairRequestMapper.mapToRepairRequestDto(repairRequest))
                .collect(Collectors.toList());
    }

    @Override
    public RepairRequestDto updateRepairRequest(Long repairrequestId, RepairRequestDto updateRepairRequest) {
        RepairRequest repairRequest=repairRequestRepository.findById(repairrequestId).orElseThrow(
                () -> new ResourceNotFoundException("Repair Request is not exists with given id : "+repairrequestId)
        );
        repairRequest.setCustomerName(updateRepairRequest.getCustomerName());
        repairRequest.setDevice(updateRepairRequest.getDevice());
        repairRequest.setIssue(updateRepairRequest.getIssue());

        RepairRequest updateRepairRequestObj = repairRequestRepository.save(repairRequest);

        return RepairRequestMapper.mapToRepairRequestDto(updateRepairRequestObj);
    }

    @Override
    public void deleteRepairRequest(Long repairrequestId) {
        RepairRequest repairRequest=repairRequestRepository.findById(repairrequestId).orElseThrow(
                () -> new ResourceNotFoundException("Repair Request is not exists with given id : "+repairrequestId)
        );
        repairRequestRepository.deleteById(repairrequestId);
    }
}
