package pe.com.laonce.laonceservice.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class TeamEntity extends BaseEntity {

    public TeamEntity() {
        super();
        setTableName("team");
    }

    public TeamEntity(Connection connection) {
        super(connection);
        setTableName("team");
    }

    public List<Team> findAll(TeamEntity regionsEntity) {
        return findByCriteria("");
    }


    public boolean update(Team region) {
        return updateByCriteria("UPDATE team SET NAME = '" +
                region.getName() + "' WHERE ID_TEAM = " +
                String.valueOf(region.getId_team()));
    }

    private boolean updateByCriteria(String sql) {
        try {
            return getConnection().createStatement().executeUpdate(sql) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    private List<Team> findByCriteria(String criteria) {
        List<Team> teams = new ArrayList<>();
        String sql = getDefaultStatement() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            teams.add((new Team()).setId_team(resultSet.getInt("ID_TEAM"))
                    .setName(resultSet.getString("NAME")));
            } catch (SQLException e1) {
            e1.printStackTrace();
        }

        return teams;
    }


}
