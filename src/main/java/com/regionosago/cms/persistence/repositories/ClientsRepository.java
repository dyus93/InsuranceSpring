package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ClientsRepository extends JpaRepository<Clients, UUID> {

    @Query(value = "SELECT osago.public.tbl_clients.fld_surname FROM osago.public.tbl_clients INNER JOIN osago.public.tbl_cars p ON tbl_clients.id_client = p.fld_clients_id WHERE p.fld_clients_id = :id", nativeQuery = true)
    String obtainClientSurnameByCar(@Param("id") UUID id);
}
