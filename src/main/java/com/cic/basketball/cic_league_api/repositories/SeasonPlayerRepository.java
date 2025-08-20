package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.SeasonPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonPlayerRepository extends JpaRepository< SeasonPlayer, Long >
{
}
