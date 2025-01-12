package com.example.parkingSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "parking_slots")
public class ParkingSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slot_id;

    @Column(name = "slot_name", nullable = false, unique = true)
    private String slotName;

    @Column(name = "slot_type", nullable = false)
    private String slotType; // "CAR" or "BIKE"

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    public Long getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(Long slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
