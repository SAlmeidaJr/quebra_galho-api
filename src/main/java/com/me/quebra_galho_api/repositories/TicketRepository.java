package com.me.quebra_galho_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.quebra_galho_api.models.Ticket;

public interface TicketRepository extends JpaRepository <Ticket, Long>{
}
