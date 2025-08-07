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
@Table(name = "Player_Game_Stats")
public class PlayerGameStats
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "points", nullable = true)
    private Byte points;

    @Column(name = "rebounds", nullable = true)
    private Byte rebounds;

    @Column(name = "assists", nullable = true)
    private Byte assists;

    @Column(name = "turnovers", nullable = true)
    private Byte turnovers;

    @Column(name = "steals", nullable = true)
    private Byte steals;

    @Column(name = "blocks", nullable = true)
    private Byte blocks;

    @Column(name = "fouls", nullable = true)
    private Byte fouls;

}
