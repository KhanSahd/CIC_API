package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.SeasonPlayer;
import com.cic.basketball.cic_league_api.repositories.SeasonPlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class SeasonPlayerService
{
    private final SeasonPlayerRepository seasonPlayerRepository;

    public SeasonPlayerService( SeasonPlayerRepository seasonPlayerRepository )
    {
        this.seasonPlayerRepository = seasonPlayerRepository;
    }

    public Iterable< SeasonPlayer > getAllSeasonPlayers()
    {
        return seasonPlayerRepository.findAll();
    }

    public SeasonPlayer createSeasonPlayer( SeasonPlayer player )
    {
        // TODO: Add Validation.
        return seasonPlayerRepository.save( player );
    }

    public SeasonPlayer getSeasonPlayerById( Long id )
    {
        return seasonPlayerRepository.findById( id ).orElse( null );
    }
}
