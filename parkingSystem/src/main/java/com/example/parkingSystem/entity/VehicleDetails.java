package com.example.parkingSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "vehicle_details")
public class VehicleDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "vehicle_number", nullable = false)
    private String vehicleNumber;

    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;

    @Column(name="contact_number", nullable = false)
    private String contactNumber;

    @ManyToOne
    @JoinColumn(name = "slot_name", referencedColumnName = "slot_name")
    private ParkingSlot slotName;

    @Column(name = "total_amount")
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "entered_by", referencedColumnName = "staff_id")
    private Staffs enteredBy;

    @Column(name = "enter_timestamp")
    private LocalDateTime enterTimestamp;

    @ManyToOne
    @JoinColumn(name = "exited_by", referencedColumnName = "staff_id")
    private Staffs exitedBy;

    @Column(name = "exit_timestamp")
    private LocalDateTime exitTimestamp;

    // Default no-argument constructor
    public VehicleDetails() {
    }

    // Parameterized constructor (you can keep this as well)
    public VehicleDetails(String vehicleNumber, String vehicleType, String contactNumber, ParkingSlot slotName, double totalAmount, Staffs enteredBy, LocalDateTime enterTimestamp, Staffs exitedBy, LocalDateTime exitTimestamp) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.contactNumber = contactNumber;
        this.slotName = slotName;
        this.totalAmount = totalAmount;
        this.enteredBy = enteredBy;
        this.enterTimestamp = enterTimestamp;
        this.exitedBy = exitedBy;
        this.exitTimestamp = exitTimestamp;
    }

    public long getId() {
        return id;
    }


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

    public ParkingSlot getSlotName() {
        return slotName;
    }

    public void setSlotName(ParkingSlot slotName) {
        this.slotName = slotName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Staffs getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(Staffs enteredBy) {
        this.enteredBy = enteredBy;
    }

    public LocalDateTime getEnterTimestamp() {
        return enterTimestamp;
    }

    public void setEnterTimestamp(LocalDateTime enterTimestamp) {
        this.enterTimestamp = enterTimestamp;
    }

    public Staffs getExitedBy() {
        return exitedBy;
    }

    public void setExitedBy(Staffs exitedBy) {
        this.exitedBy = exitedBy;
    }

    public LocalDateTime getExitTimestamp() {
        return exitTimestamp;
    }

    public void setExitTimestamp(LocalDateTime exitTimestamp) {
        this.exitTimestamp = exitTimestamp;
    }
// Getters and setters...
}
