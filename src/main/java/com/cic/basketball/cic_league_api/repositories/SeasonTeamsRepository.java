package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.SeasonTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonTeamsRepository extends JpaRepository< SeasonTeam, Long >
{
}
