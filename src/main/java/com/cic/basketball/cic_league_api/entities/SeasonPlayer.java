package com.cic.basketball.cic_league_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "Season_Players" )
public class SeasonPlayer
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
    @JoinColumn( name = "player_id", nullable = false )
    private Player playerId;

    @ManyToOne
    @NotNull
    @JoinColumn( name = "team_id", nullable = false )
    private Team teamId;

    @NotNull
    @Column( name = "jersey_number" )
    private Byte jerseyNumber;

    @NotNull
    @Size(min = 1, max = 2)
    @Column( name = "position", length = 2)
    private String position;

}
