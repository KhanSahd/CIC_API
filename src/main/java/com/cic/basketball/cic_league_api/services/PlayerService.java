package com.cic.basketball.cic_league_api.services;

import com.cic.basketball.cic_league_api.entities.Player;
import com.cic.basketball.cic_league_api.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService
{
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    public Iterable<Player> getAllPlayers()
    {
        return playerRepository.findAll();
    }

    public Player createPlayer(Player player)
    {
        // TODO: Add validation
        return playerRepository.save(player);
    }

    public Player getPlayerById(Long id)
    {
        return playerRepository.findById(id).orElse(null);
    }
}
