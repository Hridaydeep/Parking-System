package com.example.parkingSystem.repository;

import com.example.parkingSystem.entity.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingSlotRepo extends JpaRepository<ParkingSlot, Long> {
    /**
     * Returns a parking slot of the given type that is available.
     *
     * @param slotType the type of parking slot
     * @param isAvailable whether the parking slot should be available
     * @return a parking slot of the given type that is available
     */
    List<ParkingSlot> findBySlotTypeAndIsAvailable(String slotType, boolean isAvailable);
    /**
     * Return true if any parking slot of the given type is available.
     *
     * @param slotType the type of parking slot
     * @return true if any parking slot of the given type is available
     */
     ParkingSlot findBySlotName(String slotName);
}
