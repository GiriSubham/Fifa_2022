package com.sample.Fifa_2022.Service;

import com.sample.Fifa_2022.Entity.PlayerDefense;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PlayerDefenseService  {

    public List<PlayerDefense> getPlayerDefenseData();

    public  PlayerDefense getplayerDefenseById(@PathVariable("id") Integer id);

    public Specification<PlayerDefense> getplayerDefensefilter(String position);
}

