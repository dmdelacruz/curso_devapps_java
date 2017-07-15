package com.laonce.fulbito.models;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by PinkFloyd on 14/07/2017.
 */
public class Match {
    private Integer id;
    private Integer team_id;
    private Date gameplay;
    private String score;
    private Type field_id;
    private Match match;

    public Match(Integer id, Integer team_id, Date gameplay, String score, Type field_id, Match match) {
        this.id = id;
        this.team_id = team_id;
        this.gameplay = gameplay;
        this.score = score;
        this.field_id = field_id;
        this.match = match;
    }

    public Match() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public Date getGameplay() {
        return gameplay;
    }

    public void setGameplay(Date gameplay) {
        this.gameplay = gameplay;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Type getField_id() {
        return field_id;
    }

    public void setField_id(Type field_id) {
        this.field_id = field_id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
