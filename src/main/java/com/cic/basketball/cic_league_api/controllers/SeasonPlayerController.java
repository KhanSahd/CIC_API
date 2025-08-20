package com.cic.basketball.cic_league_api.controllers;

import com.cic.basketball.cic_league_api.entities.SeasonPlayer;
import com.cic.basketball.cic_league_api.services.SeasonPlayerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season/{id}/players")
public class SeasonPlayerController
{
    private final SeasonPlayerService seasonPlayerService;

    /**
     * Default constructor
     * @param seasonPlayerService the service associated with Season Players.
     */
    public SeasonPlayerController( SeasonPlayerService seasonPlayerService )
    {
        this.seasonPlayerService = seasonPlayerService;
    }

    /**
     * Method to get all players for the current season.
     * @return Iterable container SeasonPlayer entities.
     */
    @RequestMapping
    public Iterable< SeasonPlayer > getAllSeasonPlayers()
    {
        return seasonPlayerService.getAllSeasonPlayers();
    }

    /**
     * Created a new SeasonPlayer entry in the database using the {@link SeasonPlayerService}
     * @param seasonPlayer instance used to register the entity.
     * @return an instance of the created {@link SeasonPlayer}.
     */
    @PostMapping
    public SeasonPlayer createSeasonPlayer( @Valid @RequestBody SeasonPlayer seasonPlayer )
    {
        return seasonPlayerService.createSeasonPlayer( seasonPlayer );
    }
}
