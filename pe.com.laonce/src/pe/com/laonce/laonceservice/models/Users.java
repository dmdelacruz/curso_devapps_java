package pe.com.laonce.laonceservice.models;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class Users {
    private int id_users;
    private String password;
    private String email;
    private Usertipe usertipe;
    private Team team;

    public Users(int id_users, String password, String email, Usertipe usertipe, Team team) {
        this.id_users = id_users;
        this.password = password;
        this.email = email;
        this.usertipe = usertipe;
        this.team = team;
    }

    public Users() {
    }

    public int getId_users() {
        return id_users;
    }

    public Users setId_users(int id_users) {
        this.id_users = id_users;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Users setEmail(String email) {
        this.email = email;
        return this;
    }

    public Team getTeam() {
        return team;
    }

    public Users setTeam(Team team) {
        this.team = team;
        return this;
    }

    public Usertipe getUsertipe() {
        return usertipe;
    }

    public Users setUsertipe(Usertipe usertipe) {
        this.usertipe = usertipe;
        return this;
    }
}
