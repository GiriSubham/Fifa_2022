package com.sample.Fifa_2022.DAO;

import com.sample.Fifa_2022.Entity.playerStatistics;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface playerStatsDAO extends JpaRepository<playerStatistics, Integer> {
    List<playerStatistics> findAll(Specification<playerStatistics> specification);
}
