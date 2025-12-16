package DataBaseConnectionFactory;

public class PostgreSQLConnection implements DatabaseConnection{
    private String connectionString;

    public PostgreSQLConnection(String host, int port, String database) {
        this.connectionString = "postgresql://" + host + ":" + port + "/" + database;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL: " + connectionString);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL");
    }
}
