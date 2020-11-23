package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Fine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface FineRepository extends JpaRepository<Fine, UUID> {

    @Query(value = "SELECT osago.public.tbl_fine.fld_name FROM osago.public.tbl_fine INNER JOIN osago.public.tbl_cars p ON tbl_fine.id = p.fld_fine_id WHERE p.fld_fine_id = :id", nativeQuery = true)
    String obtainFineNameByCar(@Param("id") UUID id);
}
