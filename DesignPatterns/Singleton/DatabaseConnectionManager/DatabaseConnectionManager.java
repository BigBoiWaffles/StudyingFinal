package DatabaseConnectionManager;

import DataBaseConnectionFactory.DatabaseConnection;

class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;

    private DatabaseConnectionManager(){ }

    public static synchronized DatabaseConnectionManager getInstance(){
        if (instance == null){
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect(String url){
        this.connection = new Connection(url);
        this.connection.connect();
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void disconnect(){
        this.connection.disconnect();
        this.connection = null;
    }

    public void executeQuery(String query){
        this.connection.executeQuery(query);
    }
}
