package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PassportRepository extends JpaRepository<Passport, UUID> {
}
