package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.Game;
import com.cic.basketball.cic_league_api.repositories.GamesRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService
{
    private final GamesRepository gamesRepository;

    public GameService(GamesRepository gamesRepository)
    {
        this.gamesRepository = gamesRepository;
    }

    public Iterable<Game> getAllGames()
    {
        return gamesRepository.findAll();
    }

    public Game createGame(Game game)
    {
        // TODO: Add validation
        return gamesRepository.save(game);
    }

    public Game getGameById(Long id)
    {
        return gamesRepository.findById(id).orElse(null);
    }

}
