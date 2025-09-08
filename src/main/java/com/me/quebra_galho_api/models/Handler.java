package com.me.quebra_galho_api.models;

import java.util.UUID;

import com.me.quebra_galho_api.annotations.ValidRating;
import com.me.quebra_galho_api.enums.Especialization;

import jakarta.persistence.Column;
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

    @Column(nullable= false)
    private String name;

    @Column(nullable= false, unique= true )
    private String email;

    @Column(nullable=false, length=20)
    private String password;

    @Column(nullable= false)
    private Especialization type;

    @Column(precision= 3, scale= 0)
    @ValidRating
    private short numericalRating;
}
