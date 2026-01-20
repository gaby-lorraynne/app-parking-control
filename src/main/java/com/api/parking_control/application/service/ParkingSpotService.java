package com.api.parking_control.application.service;

import com.api.parking_control.application.port.in.CreateParkingSpotUseCasePort;
import com.api.parking_control.application.port.out.ParkingSpotPort;
import com.api.parking_control.domain.model.ParkingSpot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ParkingSpotService implements CreateParkingSpotUseCasePort {
    private final ParkingSpotPort port;

    @Override
    public ParkingSpot cadastrarVaga(ParkingSpot parkingSpot) {
        parkingSpot.setRegistrationDate(LocalDateTime.now());
        return port.salvar(parkingSpot);
    }
}
