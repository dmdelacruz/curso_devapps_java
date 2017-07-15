package pe.com.laonce.laonceservice.model;

import java.sql.Connection;

/**
 * Created by rmelgarl on 15/07/2017.
 */
public class LAONCEDataStore {
    private Connection connection;
    private TeamEntity teamEntity;
    private UsertipeEntity usertipeEntity;
    private UserEntity userEntity;

    public LAONCEDataStore() {
    }

    public LAONCEDataStore(Connection connection, TeamEntity teamEntity, UsertipeEntity usertipeEntity, UserEntity userEntity) {
        this.connection = connection;
        this.teamEntity = teamEntity;
        this.usertipeEntity = usertipeEntity;
        this.userEntity = userEntity;
    }

    public TeamEntity getTeamEntity(){
        if (teamEntity == null){
            teamEntity = new TeamEntity(connection);
        }
        return teamEntity;
    }
    public UsertipeEntity getUsertipeEntity(){

        if (usertipeEntity == null){
            usertipeEntity = new UsertipeEntity(connection);
        }
        return usertipeEntity;
    }
    public UserEntity getUserEntity(){
        if (userEntity == null){
            userEntity = new UserEntity(connection);
        }

        return userEntity;
    }
}
