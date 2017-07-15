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

    public List<Users> findAll() {
        return findByCriteria("");
    }

    public Region findById(int id) {
        String sql = "id = " + String.valueOf(id);
        List<Region> regions = findByCriteria(sql);
        return regions.isEmpty() ? null : regions.get(0);
    }

    public boolean create(Region region) {
        return updateByCriteria("INSERT INTO regions(region_id, region_name) " +
                "VALUES("+ String.valueOf(region.getId()) + ", " +
                "'" + region.getName() + "'"+")");
    }

    public boolean update(Region region) {
        return updateByCriteria("UPDATE regions SET region_name = '" +
        region.getName() + "' WHERE region_id = " +
                String.valueOf(region.getId()));
    }
    private boolean updateByCriteria(String sql) {
        try {
            return getConnection().createStatement().executeUpdate(sql) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Users> findByCriteria(String criteria, UsertipeEntity usertipeEntity, TeamEntity teamEntity ) {
        List<Users> Users = new ArrayList<>();
        String sql = getDefaultStatement() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            while(rs.next()) {
                Users.add((new Users()).setId(rs.getInt("ID"))
                .setPassword(rs.getString("PASSWORD")).setEmail(rs.getString("EMAIL"))
                .usertipeEntity(findById());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Users;
    }

}
