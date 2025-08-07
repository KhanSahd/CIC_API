package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository< Game, Long >
{
}
