package com.example.parkingSystem.repository;

import com.example.parkingSystem.entity.ParkingSlot;
import com.example.parkingSystem.entity.VehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDetailsRepo extends JpaRepository<VehicleDetails, Long> {

    VehicleDetails findBySlotNameAndExitedByIsNull(ParkingSlot slotName);

    VehicleDetails findByVehicleNumberAndExitedByIsNull(String vehicleNumber);
}
