package com.api.parking_control.application.port.in;

import com.api.parking_control.domain.model.ParkingSpot;

public interface CreateParkingSpotUseCasePort {
    ParkingSpot cadastrarVaga(ParkingSpot parkingSpot);
}
