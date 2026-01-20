package com.api.parking_control.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {
    private UUID id;
    private String parkingSpotNumber;
    private String licensePlateCar;
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private LocalDateTime registrationDate;
    private String responsibleName;
    private String apartment;
    private String block;
}
