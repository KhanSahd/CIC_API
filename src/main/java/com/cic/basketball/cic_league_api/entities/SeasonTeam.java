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
@Table( name = "Season_Teams" )
public class SeasonTeam
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "season_id", nullable = false )
    private Season seasonId;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "team_id", nullable = false )
    private Team teamId;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "player_id", nullable = false )
    private Player captainId;
}
