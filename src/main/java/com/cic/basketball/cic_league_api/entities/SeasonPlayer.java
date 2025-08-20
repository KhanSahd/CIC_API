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

    @NotNull
    @Column( name = "season_id", length = 255, nullable = false )
    private Long seasonId;

    @NotNull
    @Column( name = "player_id", length = 255, nullable = false )
    private Long playerId;

    @ManyToOne
    @NotNull
    @Column( name = "team_id", length = 255, nullable = false )
    private Long teamId;

    @NotNull
    @Column( name = "jersey_number" )
    private Byte jerseyNumber;

    @NotNull
    @Size(min = 1, max = 2)
    @Column( name = "position", length = 2)
    private String position;

}
