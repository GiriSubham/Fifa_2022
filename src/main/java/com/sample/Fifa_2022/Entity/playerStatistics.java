package com.sample.Fifa_2022.Entity;

import javax.persistence.*;

@Entity
@Table(name = "player_stats")
public class playerStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String player;
    private String position;
    private String team;
    private String age;
    private String club;
    private Integer birthYear;
    private Integer games;
    private Integer gamesStarts;
    private Integer minutes;
    private Double minutes90s;
    private Integer goals;
    private Integer assists;
    private Integer goalsPens;
    private Integer pensMade;
    private Integer pensAtt;
    private Integer cardsYellow;
    private Integer cardsRed;
    private Double goalsPer90;
    private Double assistsPer90;
    private Double goalsAssistsPer90;
    private Double goalsPensPer90;
    private Double goalsAssistsPensPer90;
    private Double xg;
    private Double npxg;
    private Double xgAssist;
    private Double npxgXgAssist;
    private Double xgPer90;
    private Double xgAssistPer90;
    private Double xgXgAssistPer90;
    private Double npxgPer90;
    private Double npxgXgAssistPer90;

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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getGamesStarts() {
        return gamesStarts;
    }

    public void setGamesStarts(Integer gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Double getMinutes90s() {
        return minutes90s;
    }

    public void setMinutes90s(Double minutes90s) {
        this.minutes90s = minutes90s;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getGoalsPens() {
        return goalsPens;
    }

    public void setGoalsPens(Integer goalsPens) {
        this.goalsPens = goalsPens;
    }

    public Integer getPensMade() {
        return pensMade;
    }

    public void setPensMade(Integer pensMade) {
        this.pensMade = pensMade;
    }

    public Integer getPensAtt() {
        return pensAtt;
    }

    public void setPensAtt(Integer pensAtt) {
        this.pensAtt = pensAtt;
    }

    public Integer getCardsYellow() {
        return cardsYellow;
    }

    public void setCardsYellow(Integer cardsYellow) {
        this.cardsYellow = cardsYellow;
    }

    public Integer getCardsRed() {
        return cardsRed;
    }

    public void setCardsRed(Integer cardsRed) {
        this.cardsRed = cardsRed;
    }

    public Double getGoalsPer90() {
        return goalsPer90;
    }

    public void setGoalsPer90(Double goalsPer90) {
        this.goalsPer90 = goalsPer90;
    }

    public Double getAssistsPer90() {
        return assistsPer90;
    }

    public void setAssistsPer90(Double assistsPer90) {
        this.assistsPer90 = assistsPer90;
    }

    public Double getGoalsAssistsPer90() {
        return goalsAssistsPer90;
    }

    public void setGoalsAssistsPer90(Double goalsAssistsPer90) {
        this.goalsAssistsPer90 = goalsAssistsPer90;
    }

    public Double getGoalsPensPer90() {
        return goalsPensPer90;
    }

    public void setGoalsPensPer90(Double goalsPensPer90) {
        this.goalsPensPer90 = goalsPensPer90;
    }

    public Double getGoalsAssistsPensPer90() {
        return goalsAssistsPensPer90;
    }

    public void setGoalsAssistsPensPer90(Double goalsAssistsPensPer90) {
        this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getNpxg() {
        return npxg;
    }

    public void setNpxg(Double npxg) {
        this.npxg = npxg;
    }

    public Double getXgAssist() {
        return xgAssist;
    }

    public void setXgAssist(Double xgAssist) {
        this.xgAssist = xgAssist;
    }

    public Double getNpxgXgAssist() {
        return npxgXgAssist;
    }

    public void setNpxgXgAssist(Double npxgXgAssist) {
        this.npxgXgAssist = npxgXgAssist;
    }

    public Double getXgPer90() {
        return xgPer90;
    }

    public void setXgPer90(Double xgPer90) {
        this.xgPer90 = xgPer90;
    }

    public Double getXgAssistPer90() {
        return xgAssistPer90;
    }

    public void setXgAssistPer90(Double xgAssistPer90) {
        this.xgAssistPer90 = xgAssistPer90;
    }

    public Double getXgXgAssistPer90() {
        return xgXgAssistPer90;
    }

    public void setXgXgAssistPer90(Double xgXgAssistPer90) {
        this.xgXgAssistPer90 = xgXgAssistPer90;
    }

    public Double getNpxgPer90() {
        return npxgPer90;
    }

    public void setNpxgPer90(Double npxgPer90) {
        this.npxgPer90 = npxgPer90;
    }

    public Double getNpxgXgAssistPer90() {
        return npxgXgAssistPer90;
    }

    public void setNpxgXgAssistPer90(Double npxgXgAssistPer90) {
        this.npxgXgAssistPer90 = npxgXgAssistPer90;
    }
}
