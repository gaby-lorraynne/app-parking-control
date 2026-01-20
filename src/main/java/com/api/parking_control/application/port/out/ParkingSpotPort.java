package com.api.parking_control.application.port.out;

import com.api.parking_control.domain.model.ParkingSpot;

public interface ParkingSpotPort {
    ParkingSpot salvar(ParkingSpot parkingSpot);
}
