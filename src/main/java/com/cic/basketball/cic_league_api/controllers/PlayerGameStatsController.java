package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.PlayerGameStats;
import com.cic.basketball.cic_league_api.services.PlayerGameStatsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games/{gameId}")
public class PlayerGameStatsController
{
    private final PlayerGameStatsService gameStatsService;

    public PlayerGameStatsController(PlayerGameStatsService gameStatsService)
    {
        this.gameStatsService = gameStatsService;
    }

    @RequestMapping
    public Iterable<PlayerGameStats> getAllGameStats()
    {
        return gameStatsService.getAllGameStats();
    }

    @PostMapping
    public PlayerGameStats createGame(@Valid @RequestBody PlayerGameStats requestBody)
    {
        return gameStatsService.createGameStats(requestBody);
    }
}
