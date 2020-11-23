package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface PassportRepository extends JpaRepository<Passport, UUID> {

//    @Query(value = "SELECT ", nativeQuery = true)
//    String obtainPassportByClients(@Param("id") UUID id);
}
