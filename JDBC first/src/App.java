
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        String URL="jdbc:mysql://localhost:3306/JDBC first";
        String db_user="root";
        String db_password="021603";


        //loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connecting to the database
        Connection conn= DriverManager.getConnection(URL,db_password,db_user);
        System.out.println("Database Connected");


        PreparedStatement preparedStatement= ConnectException.preparedStatement("insert into users(name,age) values(,)");
        preparedStatement.setString("hello");
    }
}
