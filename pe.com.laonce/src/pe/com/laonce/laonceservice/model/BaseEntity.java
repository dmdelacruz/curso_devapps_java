package pe.com.laonce.laonceservice.model;

import java.sql.Connection;

/**
 * Created by Administrador on 03/06/2017.
 */
public class BaseEntity {
    private Connection connection;
    private String tableName;

    public BaseEntity(Connection connection) {
        this.connection = connection;
    }

    public BaseEntity() {
    }

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public BaseEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getDefaultStatement() {
        return "SELECT * FROM " + getTableName();
    }

}
