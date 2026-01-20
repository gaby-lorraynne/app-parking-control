package com.api.parking_control.adapters.out.persistence.jparepository;

import com.api.parking_control.adapters.out.persistence.entity.ParkingSpotEntity;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkSpotRepository extends JpaRepository<ParkingSpotEntity, UUID> {
}
