package com.sample.Fifa_2022.Entity;


import javax.persistence.*;

@Entity
@Table(name = "player_defence")
public class PlayerDefense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String player;
    private String position;
    private String team;
    private String age;
    private Integer birthYear;
    private Double minutes90s;
    private Integer tackles;
    private Integer tacklesWon;
    private Integer tacklesDef3rd;
    private Integer tacklesMid3rd;
    private  Integer tacklesAtt3rd;
    private Integer dribbleTackles;
    private Integer dribblesVs;
    private Double   dribbleTacklesPct;
    private Integer dribbledPast;
    private Integer blocks;
    private Integer blockedShots;
    private Integer blockedPasses;
    private Integer interceptions;
    private Integer tacklesInterceptions;
    private Integer clearances;
    private Integer errors;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Double getMinutes90s() {
        return minutes90s;
    }

    public void setMinutes90s(Double minutes90s) {
        this.minutes90s = minutes90s;
    }

    public Integer getTackles() {
        return tackles;
    }

    public void setTackles(Integer tackles) {
        this.tackles = tackles;
    }

    public Integer getTacklesWon() {
        return tacklesWon;
    }

    public void setTacklesWon(Integer tacklesWon) {
        this.tacklesWon = tacklesWon;
    }

    public Integer getTacklesDef3rd() {
        return tacklesDef3rd;
    }

    public void setTacklesDef3rd(Integer tacklesDef3rd) {
        this.tacklesDef3rd = tacklesDef3rd;
    }

    public Integer getTacklesMid3rd() {
        return tacklesMid3rd;
    }

    public void setTacklesMid3rd(Integer tacklesMid3rd) {
        this.tacklesMid3rd = tacklesMid3rd;
    }

    public Integer getTacklesAtt3rd() {
        return tacklesAtt3rd;
    }

    public void setTacklesAtt3rd(Integer tacklesAtt3rd) {
        this.tacklesAtt3rd = tacklesAtt3rd;
    }

    public Integer getDribbleTackles() {
        return dribbleTackles;
    }

    public void setDribbleTackles(Integer dribbleTackles) {
        this.dribbleTackles = dribbleTackles;
    }

    public Integer getDribblesVs() {
        return dribblesVs;
    }

    public void setDribblesVs(Integer dribblesVs) {
        this.dribblesVs = dribblesVs;
    }

    public Double getDribbleTacklesPct() {
        return dribbleTacklesPct;
    }

    public void setDribbleTacklesPct(Double dribbleTacklesPct) {
        this.dribbleTacklesPct = dribbleTacklesPct;
    }

    public Integer getDribbledPast() {
        return dribbledPast;
    }

    public void setDribbledPast(Integer dribbledPast) {
        this.dribbledPast = dribbledPast;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getBlockedShots() {
        return blockedShots;
    }

    public void setBlockedShots(Integer blockedShots) {
        this.blockedShots = blockedShots;
    }

    public Integer getBlockedPasses() {
        return blockedPasses;
    }

    public void setBlockedPasses(Integer blockedPasses) {
        this.blockedPasses = blockedPasses;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getTacklesInterceptions() {
        return tacklesInterceptions;
    }

    public void setTacklesInterceptions(Integer tacklesInterceptions) {
        this.tacklesInterceptions = tacklesInterceptions;
    }

    public Integer getClearances() {
        return clearances;
    }

    public void setClearances(Integer clearances) {
        this.clearances = clearances;
    }

    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }


}
