package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.SeasonTeam;
import com.cic.basketball.cic_league_api.repositories.SeasonTeamsRepository;
import org.springframework.stereotype.Service;

@Service
public class SeasonTeamsService
{
    private final SeasonTeamsRepository seasonTeamsRepository;

    public SeasonTeamsService( SeasonTeamsRepository seasonTeamsRepository )
    {
        this.seasonTeamsRepository = seasonTeamsRepository;
    }

    public Iterable< SeasonTeam > getAllSeasonTeams()
    {
        return seasonTeamsRepository.findAll();
    }

    public SeasonTeam createSeasonTeam( SeasonTeam seasonTeam )
    {
        // TODO: Add validation.
        return seasonTeamsRepository.save( seasonTeam );
    }

    public SeasonTeam getSeasonTeamById( Long id )
    {
        return seasonTeamsRepository.findById( id ).orElse( null );
    }
}
