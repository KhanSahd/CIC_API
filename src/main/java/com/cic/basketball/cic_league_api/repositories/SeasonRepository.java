package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository< Season, Long >
{
}
