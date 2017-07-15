package pe.com.laonce.laonceservice.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class UsertipeEntity extends BaseEntity {

    private List<Usertipe> findByCriteria(String criteria) {
        List<Usertipe> usertipe = new ArrayList<>();
        String sql = getDefaultStatement() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            usertipe.add((new Usertipe()).setId_usertipe(resultSet.getInt("ID_TEAM"))
                    .setTipe(resultSet.getString("NAME")));
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return usertipe;
    }

    public Usertipe findById(int id) {
        String sql = "ID_USERTIPE = " + String.valueOf(id);
        List<Usertipe> usertipe = findByCriteria(sql);
        return usertipe.isEmpty() ? null : usertipe.get(0);
    }

}





