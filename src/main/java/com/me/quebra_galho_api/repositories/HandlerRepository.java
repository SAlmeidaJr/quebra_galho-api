package com.me.quebra_galho_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.quebra_galho_api.models.Handler;

public interface HandlerRepository extends JpaRepository<Handler, UUID>{

}
