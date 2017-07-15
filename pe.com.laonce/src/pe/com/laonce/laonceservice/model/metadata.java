package pe.com.laonce.laonceservice.model;

import java.util.Date;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Metadata {
    private int id_metadata;
    private Team id_team;
    private Date gameplay;
    private String score;
    private Field id_field;

    public Metadata() {
    }

    public Metadata(int id_metadata, Team id_team, Date gameplay, String score, Field id_field) {
        this.id_metadata = id_metadata;
        this.id_team = id_team;
        this.gameplay = gameplay;
        this.score = score;
        this.id_field = id_field;
    }

    public int getId_metadata() {
        return id_metadata;
    }

    public Metadata setId_metadata(int id_metadata) {
        this.id_metadata = id_metadata;
        return this;
    }

    public Team getId_team() {
        return id_team;
    }

    public Metadata setId_team(Team id_team) {
        this.id_team = id_team;
        return this;
    }

    public Date getGameplay() {
        return gameplay;
    }

    public Metadata setGameplay(Date gameplay) {
        this.gameplay = gameplay;
        return this;
    }

    public String getScore() {
        return score;
    }

    public Metadata setScore(String score) {
        this.score = score;
        return this;
    }

    public Field getId_field() {
        return id_field;
    }

    public Metadata setId_field(Field id_field) {
        this.id_field = id_field;
        return this;
    }
}
