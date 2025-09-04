package com.me.quebra_galho_api.models;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.quebra_galho_api.annotations.ValidRating;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="TB_REQUESTER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Requester {
    
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(nullable=false)
    private String name;

    @Column(unique=true,nullable=false)
    private String email;

    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String location;

    @Column(precision= 3, scale= 0)
    @ValidRating
    private byte rating;
    
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy="requester", fetch= FetchType.LAZY)
    private Set<Ticket> tickets = new HashSet<>();
}
