package pe.com.laonce.laonceservice.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 03/06/2017.
 */
public class UserEntity extends BaseEntity {

    public UserEntity() {
        super();
        setTableName("USER");
    }

    public UserEntity(Connection connection) {
        super(connection);
        setTableName("USER");
    }

  /*  public List<Users> findAll() {
        return findByCriteria("");
    }

    public Users findById(int id) {
        String sql = "id = " + String.valueOf(id);
        List<Users> user = findByCriteria(sql);
        return user.isEmpty() ? null : user.get(0);
    }*/

    public boolean create(Users user) {
        return updateByCriteria("INSERT INTO users(ID_USERS, PASSWORD,EMAIL,ID_TIPE,ID_TEAM) " +
                "VALUES("+ String.valueOf(user.getId_users()) + ", " +
                "'" + user.getPassword() + "' , '"+"'"+user.getEmail()+"', "+user.getUsertipe()
                +", "+ user.getTeam()+")");
    }

    public boolean update(Users users) {
        return updateByCriteria("UPDATE users SET ID_USERS = '" +
        users.getPassword()+"' " + " WHERE ID_USERS = " +
                users.getId_users());
    }
    private boolean updateByCriteria(String sql) {
        try {
            return getConnection().createStatement().executeUpdate(sql) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* public List<Users> findByCriteria(String criteria, UsertipeEntity usertipeEntity, TeamEntity teamEntity ) {
        List<Users> Users = new ArrayList<>();
        String sql = getDefaultStatement() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            while(rs.next()) {
                Users.add(
                new Users(rs.getString("PASSWORD"),
                          rs.getString("EMAIL"),
                          UserEntity.findById(rs.getString("ID_TIPE"))
                        )

                );


                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Users;
    }
*/
}
