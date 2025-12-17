package DatabaseConnectionManager;

public class DatabaseConnectionManagerDemo {
    public static void main(String[] args){
        DatabaseConnectionManager db1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager db2 = DatabaseConnectionManager.getInstance();

        System.out.println("Same instance? " + (db1 == db2));

        db1.connect("jdbc:mysql://localhost:3306/mydb");
        db2.executeQuery("SELECT * FROM users");
    }
}
