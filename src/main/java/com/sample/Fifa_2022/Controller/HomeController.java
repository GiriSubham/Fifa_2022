package com.sample.Fifa_2022.Controller;

import com.sample.Fifa_2022.DAO.playerDefenseDAO;
import com.sample.Fifa_2022.DAO.playerStatsDAO;
import com.sample.Fifa_2022.Entity.PlayerDefense;
import com.sample.Fifa_2022.Entity.playerStatistics;
import com.sample.Fifa_2022.Service.PlayerDefenseService;
import com.sample.Fifa_2022.Service.PlayerStatsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/playerStatistics", "/defense"})
public class HomeController {

    //Importing all the DAO
    @Autowired
    private playerStatsDAO playerStatsDAO;

    @Autowired
    private playerDefenseDAO playerdefnseDAO;

    @Autowired
    private PlayerStatsService playerStatsService;

    @Autowired
    private PlayerDefenseService playerdefenseService;

     //here we will get all details

    @GetMapping("/get-all-details")
    public List<playerStatistics> getPlayerStats(){
       return this.playerStatsService.getPlayerStats();
    }

     //here we will get details by id
    @GetMapping("/get-by-id/{id}")
    public playerStatistics getplayerStatisticsById(@PathVariable("id") Integer id){

       return this.playerStatsService.getplayerStatisticsById(id);
    }



    @GetMapping("/getAllDefense")
    public List<PlayerDefense> getPlayerDefenseData(){
        return this.playerdefenseService.getPlayerDefenseData();

    }


    //here we will get details by id
    @GetMapping("/getPlayerDefenseById/{id}")
    public PlayerDefense getplayerDefenseById(@PathVariable("id") Integer id){

        return this.playerdefenseService.getplayerDefenseById(id);

    }
      //here we filtering list

    @GetMapping("/filter-list")
    public  List<playerStatistics> list(@RequestParam(value = "games",required = false) Integer games){

        Specification<playerStatistics> specification = playerStatsService.getfilterStats(games);
        return playerStatsDAO.findAll(specification);
    }
          //here we filtering defence

    @GetMapping("/filter-defense")
    public List<PlayerDefense>getfilterList(@RequestParam(value = "position",required = false)String position){
        Specification<PlayerDefense> specification = playerdefenseService.getplayerDefensefilter(position);

        return playerdefnseDAO.findAll(specification);
    }


}







