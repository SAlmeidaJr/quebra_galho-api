package com.me.quebra_galho_api.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.quebra_galho_api.enums.Especialization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_TICKET")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private Especialization type;

    @Timestamp
    private LocalDate createdAt;

    @Column(nullable=false)
    private LocalDate validity;

    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="resquester_id")
    private Requester requester;

    @Column(nullable=false)
    private String description;

    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name= "handler_id")
    private Handler handler;

}
