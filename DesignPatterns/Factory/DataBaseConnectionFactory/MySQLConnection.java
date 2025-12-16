package DataBaseConnectionFactory;

public class MySQLConnection implements DatabaseConnection{
    private String connectionString;

    public MySQLConnection(String host, int port, String database) {
        this.connectionString = "mysql://" + host + ":" + port + "/" + database;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL: " + connectionString);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL");
    }
}
