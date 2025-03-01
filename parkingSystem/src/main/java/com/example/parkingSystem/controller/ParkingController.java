package com.example.parkingSystem.controller;

import com.example.parkingSystem.dto.ReceiptDto;
import com.example.parkingSystem.dto.VehicleInfoDto;
import com.example.parkingSystem.repository.ParkingSlotRepo;
import com.example.parkingSystem.service.ParkingService;
import com.example.parkingSystem.service.implementation.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/parkingSystem/parking")
public class ParkingController {

    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/get-Info")
    public ResponseEntity<Integer> getParkingInfo(@RequestBody Map<String, String> request) {
        String slotType = request.get("slotType");  // Extract the slotType from the map
        Integer availableSlots = parkingService.isAvailable(slotType);
        return ResponseEntity.ok(availableSlots);
    }

    @GetMapping("/getParking-Info/{carNumber}")
    public ResponseEntity<String> getParkingSlotNumber(@PathVariable String carNumber) {
        return ResponseEntity.ok(parkingService.getParkingSlotNumber(carNumber));
    }

    @PostMapping("/saveParking")
    public ResponseEntity<ReceiptDto> saveParking(@RequestBody VehicleInfoDto vehicleInfoDto) {

        return ResponseEntity.ok(parkingService.saveParking(vehicleInfoDto));
    }

    @PostMapping("/exitParking")
    public ResponseEntity<ReceiptDto> exitParking(@RequestBody Map<String, String> request) {

        return ResponseEntity.ok(parkingService.exitParking(request.get("slotName")));
    }


}
