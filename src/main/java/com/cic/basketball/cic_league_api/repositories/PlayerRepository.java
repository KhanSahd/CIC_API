package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository< Player, Long >
{
}
