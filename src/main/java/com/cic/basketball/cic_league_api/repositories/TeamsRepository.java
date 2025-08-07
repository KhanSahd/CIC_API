package com.cic.basketball.cic_league_api.repositories;

import com.cic.basketball.cic_league_api.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepository extends JpaRepository< Team, Long >
{
}
