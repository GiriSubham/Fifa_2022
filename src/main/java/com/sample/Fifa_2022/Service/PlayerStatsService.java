package com.sample.Fifa_2022.Service;

import com.sample.Fifa_2022.Entity.PlayerDefense;
import com.sample.Fifa_2022.Entity.playerStatistics;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PlayerStatsService {

    public List<playerStatistics> getPlayerStats();

    public playerStatistics getplayerStatisticsById(Integer id);

    public Specification<playerStatistics> getfilterStats(Integer games);


}
