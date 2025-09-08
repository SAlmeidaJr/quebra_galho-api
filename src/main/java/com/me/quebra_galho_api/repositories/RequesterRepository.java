package com.me.quebra_galho_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.quebra_galho_api.models.Requester;

public interface RequesterRepository extends JpaRepository<Requester, UUID>{

}
