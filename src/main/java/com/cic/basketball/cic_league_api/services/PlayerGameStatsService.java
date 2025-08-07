package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.PlayerGameStats;
import com.cic.basketball.cic_league_api.repositories.PlayerGameStatsRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerGameStatsService
{
    private final PlayerGameStatsRepository gameStatsRepository;

    public PlayerGameStatsService( PlayerGameStatsRepository gameStatsRepository )
    {
        this.gameStatsRepository = gameStatsRepository;
    }

    public Iterable< PlayerGameStats > getAllGameStats()
    {
        return gameStatsRepository.findAll();
    }

    public PlayerGameStats createGameStats( PlayerGameStats gameStats )
    {
        // TODO: Add validation
        return gameStatsRepository.save( gameStats );
    }

    public PlayerGameStats getGameStatsById( Long id )
    {
        return gameStatsRepository.findById( id ).orElse( null );
    }
}
