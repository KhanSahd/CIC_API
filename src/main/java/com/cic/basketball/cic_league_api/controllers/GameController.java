package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.Game;
import com.cic.basketball.cic_league_api.services.GameService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController
{
    private final GameService gameService;

    /**
     * Constructor for the GamesController class.
     * @param gameService The game service to use.
     */
    public GameController(GameService gameService)
    {
        this.gameService = gameService;
    }

    @RequestMapping
    public Iterable<Game> getAllGames()
    {
        return gameService.getAllGames();
    }

    /**
     * Create a new game with the given data.
     * @param requestBody The data with which to create the game.
     * @return The created game.
     */
    @PostMapping
    public Game createGame(@Valid @RequestBody Game requestBody)
    {
        return gameService.createGame(requestBody);
    }
}
