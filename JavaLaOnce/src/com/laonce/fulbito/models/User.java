package com.laonce.fulbito.models;

/**
 * Created by PinkFloyd on 14/07/2017.
 */
public class User {
    private Integer id;
    private String password;
    private String email;
    private Integer type_id;
    private Integer team_id;
    private User user;

    public User(Integer id, String password, String email, Integer type_id, Integer team_id, User user) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.type_id = type_id;
        this.team_id = team_id;
        this.user = user;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
