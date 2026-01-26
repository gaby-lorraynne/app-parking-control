package com.api.parking_control.application.port.in;

import com.api.parking_control.domain.model.ParkingSpot;
import java.util.List;

public interface ListParkingSpotUseCasePort {
    List<ParkingSpot> listarVagas(String apartment);
}
