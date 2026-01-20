package com.api.parking_control.adapters.in.web.mapper;

import com.api.parking_control.adapters.in.web.dto.requestbody.ParkingSpotDtoPost;
import com.api.parking_control.adapters.in.web.dto.responsebody.ParkingSpotResponse;
import com.api.parking_control.domain.model.ParkingSpot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParkingSpotMapper {

    ParkingSpotResponse toDto(ParkingSpot model);

    ParkingSpot toModel(ParkingSpotDtoPost dto);
}
