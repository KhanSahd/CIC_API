package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.SeasonTeam;
import com.cic.basketball.cic_league_api.services.SeasonTeamsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season/{id}/teams")
public class SeasonTeamsController
{
    private final SeasonTeamsService seasonTeamsService;

    /**
     * Default constructor.
     * @param seasonTeamsService the SeasonTeamService to initialize.
     */
    public SeasonTeamsController( SeasonTeamsService seasonTeamsService )
    {
        this.seasonTeamsService = seasonTeamsService;
    }

    /**
     * Retrieves all the teams for the current season.
     * @return a List of the Season Teams.
     */
    @RequestMapping
    public Iterable< SeasonTeam > getAllSeasonTeams()
    {
        return seasonTeamsService.getAllSeasonTeams();
    }

    /**
     * Registers a new SeasonTeam by taking in a {@link SeasonTeam} via the requestBody
     * and passing it to the {@link SeasonTeamsService}'s createSeasonTeam method which handles the actual
     * registration and validation.
     * @param seasonTeam the team to register/create.
     * @return The new created instance. or Null if unsuccessful.
     */
    @PostMapping
    public SeasonTeam createSeasonTeam( @Valid @RequestBody SeasonTeam seasonTeam )
    {
        return seasonTeamsService.createSeasonTeam( seasonTeam );
    }
}
