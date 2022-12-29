package com.sample.Fifa_2022.Service;

import com.sample.Fifa_2022.DAO.playerStatsDAO;
import com.sample.Fifa_2022.Entity.PlayerDefense;
import com.sample.Fifa_2022.Entity.playerStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerStatsIMPL implements PlayerStatsService {

    @Autowired
    private playerStatsDAO playerStatsDAO;


    @Override
    public List<playerStatistics> getPlayerStats() {
        return playerStatsDAO.findAll();
    }

    @Override
    public playerStatistics getplayerStatisticsById(Integer id) {
        Optional<playerStatistics> playersbyId = playerStatsDAO.findById(id);
        playerStatistics playerStatistics = playersbyId.get();
        return playerStatistics;
    }

    @Override
    public  Specification<playerStatistics> getfilterStats(Integer games) {
        return ((root, query, criteriaBuilder) -> {
           List<Predicate>predicates =new ArrayList<>();

            if(games!=null)
                predicates.add(criteriaBuilder.equal(root.get("games"),games));

             return criteriaBuilder.and(predicates.toArray(new Predicate[0]));


        });


}

    }









