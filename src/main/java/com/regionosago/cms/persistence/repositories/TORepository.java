package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.TO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.UUID;

public interface TORepository extends JpaRepository<TO, UUID> {

    @Query(value = "SELECT osago.public.tbl_to.fld_date FROM osago.public.tbl_to INNER JOIN osago.public.tbl_cars p ON " +
            "tbl_to.id_to = p.fld_to_id WHERE p.fld_to_id = :id", nativeQuery = true)
    String obtainTOByCar(@Param("id") UUID id);
}
