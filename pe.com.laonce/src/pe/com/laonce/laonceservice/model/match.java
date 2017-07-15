package pe.com.laonce.laonceservice.model;

import java.util.Date;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Match {
    private int id_match;
    private Team id_team;
    private Date gameplay;
    private String score;
    private Field id_field;

    public Match() {
    }

    public Match(int id_match, Team id_team, Date gameplay, String score, Field id_field) {
        this.id_match = id_match;
        this.id_team = id_team;
        this.gameplay = gameplay;
        this.score = score;
        this.id_field = id_field;
    }

    public int getId_match() {
        return id_match;
    }

    public Match setId_match(int id_match) {
        this.id_match = id_match;
        return this;
    }

    public Team getId_team() {
        return id_team;
    }

    public Match setId_team(Team id_team) {
        this.id_team = id_team;
        return this;
    }

    public Date getGameplay() {
        return gameplay;
    }

    public Match setGameplay(Date gameplay) {
        this.gameplay = gameplay;
        return this;
    }

    public String getScore() {
        return score;
    }

    public Match setScore(String score) {
        this.score = score;
        return this;
    }

    public Field getId_field() {
        return id_field;
    }

    public Match setId_field(Field id_field) {
        this.id_field = id_field;
        return this;
    }
}
