package com.api.parking_control.adapters.out.persistence;

import com.api.parking_control.adapters.out.persistence.jparepository.ParkSpotRepository;
import com.api.parking_control.adapters.out.persistence.mapper.ParkingSpotEntityMapper;
import com.api.parking_control.application.port.out.ParkingSpotPort;
import com.api.parking_control.domain.model.ParkingSpot;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<ParkingSpot> listarVagas() {
        return repository.findAll()
                .stream()
                .map(mapper::toModel)
                .toList();
    }

    @Override
    public List<ParkingSpot> listarVagasPorApartamento(String apartment) {
        return repository.findByApartment(apartment).
                stream()
                .map(mapper::toModel)
                .toList();
    }
}
