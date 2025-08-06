package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.Season;
import com.cic.basketball.cic_league_api.repositories.SeasonRepository;
import org.springframework.stereotype.Service;

@Service
public class SeasonService
{
    private final SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository)
    {
        this.seasonRepository = seasonRepository;
    }

    public Iterable<Season> getAllSeasons()
    {
        return seasonRepository.findAll();
    }

    public Season createSeason(Season season)
    {
        // TODO: Add validation
        return seasonRepository.save(season);
    }
}
