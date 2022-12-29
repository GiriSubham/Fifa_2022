package com.sample.Fifa_2022.DAO;

import com.sample.Fifa_2022.Entity.PlayerDefense;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface playerDefenseDAO extends JpaRepository<PlayerDefense,Integer> {

    List<PlayerDefense> findAll(Specification<PlayerDefense> specification);
}
