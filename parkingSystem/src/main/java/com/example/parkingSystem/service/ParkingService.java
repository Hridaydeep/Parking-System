package com.example.parkingSystem.service;

import com.example.parkingSystem.dto.ReceiptDto;
import com.example.parkingSystem.dto.VehicleInfoDto;

public interface ParkingService {
    public Integer isAvailable(String slotType);
    public ReceiptDto saveParking(VehicleInfoDto vehicleInfoDto);
    public ReceiptDto exitParking(String slotName);
    public String getParkingSlotNumber(String carNumber);
}
