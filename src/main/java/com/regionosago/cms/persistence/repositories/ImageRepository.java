package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ImageRepository extends JpaRepository<Image, UUID>{

    @Query(value = "SELECT osago.public.tbl_image.fld_name FROM " +
            "osago.public.tbl_image INNER JOIN osago.public.tbl_cars p ON tbl_image.id_image = p.fld_image_id" +
            " WHERE p.fld_image_id = :id", nativeQuery = true)
    String obtainImageNameByCar(@Param("id") UUID id);
}
