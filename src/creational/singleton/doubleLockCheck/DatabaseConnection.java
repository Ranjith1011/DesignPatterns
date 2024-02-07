package creational.singleton.doubleLockCheck;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection(){

    }
    public static DatabaseConnection getDatabaseConnection(String env){

       if(databaseConnection == null){
           synchronized (DatabaseConnection.class){
               if(databaseConnection==null){
                   databaseConnection = new DatabaseConnection();
               }
           }
       }

       return databaseConnection;
    }
}
