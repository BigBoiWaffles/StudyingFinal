package DataBaseConnectionFactory;

public class DatabaseConnectionFactory {
    public DatabaseConnection createConnection(String type, String host, int port, String database){

        if (type == null){
            throw new IllegalArgumentException("Database type cannot be null");
        }
        switch (type.toUpperCase()){
            case "MYSQL":
                return new MySQLConnection(host, port, database);
            case "MONGODB":
                return new MongoDBConnection(host, port, database);
            case "POSTGRESQL":
                return new PostgreSQLConnection(host, port, database);
            default:
                throw new IllegalArgumentException("Unsupported database type: " + type);
        }
    }
}
