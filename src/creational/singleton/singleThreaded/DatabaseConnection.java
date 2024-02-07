package creational.singleton.singleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){

    }

    //For non-concurrent envs
    public static DatabaseConnection getDatabaseConnection(){
        if(databaseConnection == null){
            databaseConnection = new DatabaseConnection();
        }

        return databaseConnection;
    }
}
