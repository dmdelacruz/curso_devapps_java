package com.laonce.fulbito.models;

/**
 * Created by PinkFloyd on 14/07/2017.
 */
public class Field {
    private Integer id;
    private Integer ifuser;
    private Field field;

    public Field(Integer id, Integer ifuser, Field field) {
        this.id = id;
        this.ifuser = ifuser;
        this.field = field;
    }

    public Field() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIfuser() {
        return ifuser;
    }

    public void setIfuser(Integer ifuser) {
        this.ifuser = ifuser;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
