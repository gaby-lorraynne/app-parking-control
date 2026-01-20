package com.api.parking_control.adapters.out.persistence.mapper;

import com.api.parking_control.adapters.out.persistence.entity.ParkingSpotEntity;
import com.api.parking_control.domain.model.ParkingSpot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParkingSpotEntityMapper {
    ParkingSpotEntity toEntity(ParkingSpot model);
    ParkingSpot toModel(ParkingSpotEntity entity);
}
