package com.cic.basketball.cic_league_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "Players" )
public class Player
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @NotNull
    @Column( name = "first_name", length = 255, nullable = false )
    private String firstName;

    @NotNull
    @Column( name = "last_name", length = 255, nullable = false )
    private String lastName;

    @NotNull
    @Column( name = "jersey_number", nullable = false )
    private Byte jerseyNumber;

    @NotNull
    @Column( nullable = false, precision = 5, scale = 2 )
    private BigDecimal height;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "team_id", nullable = false )
    private Team teamId;
}
