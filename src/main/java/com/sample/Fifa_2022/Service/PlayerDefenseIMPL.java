package com.sample.Fifa_2022.Service;

import com.sample.Fifa_2022.DAO.playerDefenseDAO;
import com.sample.Fifa_2022.Entity.PlayerDefense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerDefenseIMPL implements PlayerDefenseService{

    @Autowired
    private playerDefenseDAO playerdefenseDao;


    @Override
    public List<PlayerDefense> getPlayerDefenseData() {
        return playerdefenseDao.findAll();
    }

    @Override
    public PlayerDefense getplayerDefenseById(Integer id) {
        Optional<PlayerDefense> playerdefense = playerdefenseDao.findById(id);
        return playerdefense.get();
    }

    @Override
    public Specification<PlayerDefense> getplayerDefensefilter(String position) {
        return ((root, query, criteriaBuilder) -> {
            List<Predicate>predicates =new ArrayList<>();

            if(position!=null&& !(position.isEmpty()))
                predicates.add(criteriaBuilder.equal(root.get("position"),position));

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));


        });
    }


}



