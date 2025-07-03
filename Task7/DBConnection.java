import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;

public class DBConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("db.properties"));

            String url = props.getProperty("url");
            String user = props.getProperty("username");
            String pass = props.getProperty("password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to MySQL!");
        } catch (Exception e) {
            System.out.println("Failed to connect:");
            e.printStackTrace();
        }
        return connection;
    }
}