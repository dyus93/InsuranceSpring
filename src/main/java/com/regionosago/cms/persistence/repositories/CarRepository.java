package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Cars;
import com.regionosago.cms.persistence.entities.enums.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Cars, UUID> {

}
