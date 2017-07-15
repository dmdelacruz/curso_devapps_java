package pe.com.laonce.laonceservice.model;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Usertipe {
    private int id_usertipe;
    private String tipe;

    public Usertipe(int id, String tipe) {
        this.id_usertipe = id_usertipe;
        this.tipe = tipe;
    }

    public Usertipe() {
    }

    public int getId_usertipe() {
        return id_usertipe;
    }

    public Usertipe setId_usertipe(int id) {
        this.id_usertipe = id_usertipe;
        return this;
    }

    public String getTipe() {
        return tipe;
    }

    public Usertipe setTipe(String tipe) {
        this.tipe = tipe;
        return this;
    }
}
