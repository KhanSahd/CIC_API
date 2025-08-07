package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.PlayerGameStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerGameStatsRepository extends JpaRepository< PlayerGameStats, Long >
{
}
