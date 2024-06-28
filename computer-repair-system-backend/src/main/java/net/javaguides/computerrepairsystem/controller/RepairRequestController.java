package net.javaguides.computerrepairsystem.controller;

import lombok.AllArgsConstructor;
import net.javaguides.computerrepairsystem.dto.RepairRequestDto;
import net.javaguides.computerrepairsystem.service.RepairRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/repairrequest")
public class RepairRequestController {

    private RepairRequestService repairRequestService;

    //Build Add RepairRequest REST API
    @PostMapping
    public ResponseEntity<RepairRequestDto> createRepairRequest(@RequestBody RepairRequestDto repairRequestDto){
       RepairRequestDto savedRepairRequest = repairRequestService.createRepairRequest(repairRequestDto);
       return new ResponseEntity<>(savedRepairRequest, HttpStatus.CREATED);
    }
    //Build get RepairRequest REST API
    @GetMapping("{id}")
    public ResponseEntity<RepairRequestDto> getRepairRequestById(@PathVariable("id") Long repairrequestId){
        RepairRequestDto repairRequestDto = repairRequestService.getRepairRequestById(repairrequestId);
        return ResponseEntity.ok(repairRequestDto);
    }

    //Build Get All RepairRequest REST API
    @GetMapping
    public ResponseEntity<List<RepairRequestDto>> getAllRepairRequest(){
        List<RepairRequestDto>  repairRequests = repairRequestService.getAllRepairRequest();
        return ResponseEntity.ok(repairRequests);
    }

    //Build Update RepairRequest REST API
    @PutMapping("{id}")
    public ResponseEntity<RepairRequestDto> updateRepairRequest(@PathVariable("id") Long repairrequestId,@RequestBody RepairRequestDto updateRepairRequest){
       RepairRequestDto repairRequestDto = repairRequestService.updateRepairRequest(repairrequestId, updateRepairRequest);
       return ResponseEntity.ok(repairRequestDto);
    }
    //Build Delete RepairRequest REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRepairRequest(@PathVariable("id" ) Long repairrequestId){
        repairRequestService.deleteRepairRequest(repairrequestId);
        return ResponseEntity.ok("RepairRequest Deleted Successfully! ");
    }


}
