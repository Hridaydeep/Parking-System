package com.example.parkingSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReceiptDto {
    private String vehicleNumber;

    private String vehicleType;

    private String contactNumber;

    private String slotName;

    private double totalAmount;

    private double chargePerHour;

    private LocalDateTime entryTimestamp;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getChargePerHour() {
        return chargePerHour;
    }

    public void setChargePerHour(double chargePerHour) {
        this.chargePerHour = chargePerHour;
    }

    public LocalDateTime getEntryTimestamp() {
        return entryTimestamp;
    }

    public void setEntryTimestamp(LocalDateTime entryTimestamp) {
        this.entryTimestamp = entryTimestamp;
    }

    public LocalDateTime getExitTimestamp() {
        return exitTimestamp;
    }

    public void setExitTimestamp(LocalDateTime exitTimestamp) {
        this.exitTimestamp = exitTimestamp;
    }

    public ReceiptDto(String vehicleNumber, String vehicleType, String contactNumber, String slotName, double totalAmount, double chargePerHour, LocalDateTime entryTimestamp, LocalDateTime exitTimestamp) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.contactNumber = contactNumber;
        this.slotName = slotName;
        this.totalAmount = totalAmount;
        this.chargePerHour = chargePerHour;
        this.entryTimestamp = entryTimestamp;
        this.exitTimestamp = exitTimestamp;
    }

    private LocalDateTime exitTimestamp;
}
