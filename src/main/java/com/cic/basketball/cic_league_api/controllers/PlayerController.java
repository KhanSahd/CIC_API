package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.Player;
import com.cic.basketball.cic_league_api.services.PlayerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController
{
    private final PlayerService playerService;

    /**
     * Constructor for PlayerController.
     * @param playerService The player service.
     */
    public PlayerController(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    /**
     * Get all players.
     * @return All players.
     */
    @RequestMapping
    public Iterable<Player> getAllPlayers()
    {
        return playerService.getAllPlayers();
    }

    /**
     * Create a new player with the given data.
     * @param player The data with which to create the player.
     * @return The created player.
     */
    @PostMapping
    public Player createPlayer(@Valid @RequestBody Player player)
    {
        return playerService.createPlayer(player);
    }

}
