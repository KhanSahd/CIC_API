package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.Team;
import com.cic.basketball.cic_league_api.repositories.TeamsRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService
{
    private final TeamsRepository teamsRepository;

    public TeamService(TeamsRepository teamsRepository)
    {
        this.teamsRepository = teamsRepository;
    }

    public Team createTeam(Team team)
    {
        // TODO: Add validation
        return teamsRepository.save(team);
    }

    public Iterable<Team> getAllTeams()
    {
        return teamsRepository.findAll();
    }

    public Team getTeamById(Long id)
    {
        return teamsRepository.findById(id).orElse(null);
    }
}
