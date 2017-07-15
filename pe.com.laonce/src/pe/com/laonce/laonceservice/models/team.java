package pe.com.laonce.laonceservice.models;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Team {
    private int id_team;
    private String name;

    public Team() {
    }

    public Team(int id, String name) {
        this.id_team = id_team;
        this.name = name;
    }

    public int getId_team() {
        return id_team;
    }

    public Team setId_team(int id_team) {
        this.id_team = id_team;
        return this;
    }

    public String getName() {
        return name;
    }

    public Team setName(String name) {
        this.name = name;
        return this;
    }
}
