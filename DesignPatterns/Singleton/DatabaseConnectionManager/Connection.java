package DatabaseConnectionManager;

public class Connection {
    private String url;
    private boolean isConnected;

    public Connection(String url) {
        this.url = url;
        this.isConnected = false;
    }

    public void connect() {
        isConnected = true;
        System.out.println("Connected to: " + url);
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from: " + url);
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing query: " + query);
        } else {
            System.out.println("Not connected to database");
        }
    }
}
