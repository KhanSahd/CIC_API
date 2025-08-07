package com.cic.basketball.cic_league_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "Seasons" )
public class Season
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @NotNull
    @Column( name = "season_number", nullable = false )
    private Long seasonNumber;

    @ManyToOne
    @JoinColumn( name = "Champions", nullable = true )
    private Team champions;

    @ManyToOne
    @JoinColumn( name = "MVP", nullable = true )
    private Player mvp;

    @ManyToOne
    @JoinColumn( name = "Rookie_of_Year", nullable = true )
    private Player rookieOfTheYear;

    @Column( name = "Status", nullable = true )
    private String status;

}

