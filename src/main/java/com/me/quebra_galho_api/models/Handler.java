package com.me.quebra_galho_api.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_HANDLERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Handler {
    
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
}
