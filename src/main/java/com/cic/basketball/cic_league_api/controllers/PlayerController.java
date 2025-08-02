package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.Player;
import com.cic.basketball.cic_league_api.repositories.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController
{
    private final PlayerRepository repository;

    public PlayerController(PlayerRepository repository)
    {
        this.repository = repository;
    }

    /**
     * <li>@Valid = Triggers the validation rules specified in the {@Link Player} class (e.g @NotNull, etc..)</li>
     * <li>@RequestBody = Maps the JSON payload of the HTTP request to the Player object.</li>
     * @param player the player that we are adding.
     * @return An instance of the Player we just created.
     */
    @PostMapping
    public Player createPlayer(@Valid @RequestBody Player player)
    {
        return repository.save(player);
    }

}
