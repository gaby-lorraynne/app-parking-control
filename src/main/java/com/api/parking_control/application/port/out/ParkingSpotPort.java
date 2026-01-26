package com.api.parking_control.application.port.out;

import com.api.parking_control.domain.model.ParkingSpot;

import java.util.List;

public interface ParkingSpotPort {
    ParkingSpot salvar(ParkingSpot parkingSpot);
    List<ParkingSpot> listarVagas();

    List<ParkingSpot> listarVagasPorApartamento(String apartment);
}
