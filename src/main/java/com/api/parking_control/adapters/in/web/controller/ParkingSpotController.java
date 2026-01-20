package com.api.parking_control.adapters.in.web.controller;

import com.api.parking_control.adapters.in.web.dto.requestbody.ParkingSpotDtoPost;
import com.api.parking_control.adapters.in.web.dto.responsebody.DataResponse;
import com.api.parking_control.adapters.in.web.mapper.ParkingSpotMapper;
import com.api.parking_control.adapters.in.web.dto.responsebody.ParkingSpotResponse;
import com.api.parking_control.application.port.in.CreateParkingSpotUseCasePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
@RequestMapping("/api/v1/parking-spot")
public class ParkingSpotController {

    private final CreateParkingSpotUseCasePort useCase;
    private final ParkingSpotMapper mapper;

    @PostMapping()
    public ResponseEntity<DataResponse<ParkingSpotResponse>> cadastrarVaga(
            @RequestBody@ Valid ParkingSpotDtoPost dto) {

        var response = mapper.toDto(useCase.cadastrarVaga(mapper.toModel(dto)));
        return ResponseEntity.status(HttpStatus.CREATED).body(new DataResponse<>(response));
    }

}
