package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.Season;
import com.cic.basketball.cic_league_api.services.SeasonService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seasons")
public class SeasonController
{
    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService)
    {
        this.seasonService = seasonService;
    }

    @RequestMapping
    public Iterable<Season> getAllSeasons()
    {
        return seasonService.getAllSeasons();
    }

    @PostMapping
    public Season createSeason(@Valid @RequestBody Season season)
    {
        return seasonService.createSeason(season);
    }
}
