package pe.com.laonce.laonceservice.model;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Field {
    private int id_field;
    private Users id_users;

    public Field() {
    }

    public int getId_field() {
        return id_field;
    }

    public Field setId_field(int id_field) {
        this.id_field = id_field;
        return this;
    }

    public Users getId_users() {
        return id_users;
    }

    public Field setId_users( Users id_users) {
        this.id_users = id_users;
        return this;
    }
}
