package com.cic.basketball.cic_league_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "Games" )
public class Game
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @NotNull
    @Column( name = "date", nullable = false )
    private LocalDateTime date;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "home_team_id", nullable = false )
    private Team homeTeam;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "away_team_id", nullable = false )
    private Team awayTeam;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "season_id", nullable = false )
    private Season season;
}
