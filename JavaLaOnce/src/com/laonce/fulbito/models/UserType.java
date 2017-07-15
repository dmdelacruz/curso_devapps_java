package com.laonce.fulbito.models;

/**
 * Created by PinkFloyd on 14/07/2017.
 */
public class UserType {
    private Integer id;
    private String type;
    private UserType userType;

    public UserType() {
    }

    public UserType(Integer id, String type, UserType userType) {
        this.id = id;
        this.type = type;
        this.userType = userType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
