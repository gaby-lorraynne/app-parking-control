package com.api.parking_control.adapters.out.persistence;

import com.api.parking_control.adapters.out.persistence.jparepository.ParkSpotRepository;
import com.api.parking_control.adapters.out.persistence.mapper.ParkingSpotEntityMapper;
import com.api.parking_control.application.port.out.ParkingSpotPort;
import com.api.parking_control.domain.model.ParkingSpot;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ParkingSpotPersistenceAdapter implements ParkingSpotPort {
    private final ParkSpotRepository repository;
    private final ParkingSpotEntityMapper mapper;

    @Override
    public ParkingSpot salvar(ParkingSpot parkingSpot) {
        var entity = mapper.toEntity(parkingSpot);
        repository.save(entity);
        return mapper.toModel(entity);
    }
}
