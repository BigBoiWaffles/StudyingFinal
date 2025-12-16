package DataBaseConnectionFactory;

public class MongoDBConnection implements DatabaseConnection{
    private String connectionString;

    public MongoDBConnection(String host, int port, String database) {
        this.connectionString = "mongodb://" + host + ":" + port + "/" + database;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB: " + connectionString);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MongoDB query: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB");
    }
}
