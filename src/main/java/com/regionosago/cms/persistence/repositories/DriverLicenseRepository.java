package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DriverLicenseRepository extends JpaRepository<DriverLicense, UUID> {
}
