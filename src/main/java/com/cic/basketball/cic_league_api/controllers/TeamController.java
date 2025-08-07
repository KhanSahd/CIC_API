package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.Team;
import com.cic.basketball.cic_league_api.services.TeamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/teams" )
public class TeamController
{
    private final TeamService teamService;

    public TeamController( TeamService teamService )
    {
        this.teamService = teamService;
    }

    @GetMapping
    public Iterable< Team > getAllTeams()
    {
        return teamService.getAllTeams();
    }

    @PostMapping
    public Team createTeam( @Valid @RequestBody Team team )
    {
        return teamService.createTeam( team );
    }
}
