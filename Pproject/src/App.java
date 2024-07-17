
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    //load the database driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    // connection to database
    String url = "jdbc:mysql://localhost:3306/testdb";
    String username = "root";
    String password = "021603";
    Connection conn =  DriverManager.getConnection(url, username, password);
        while(true){
            System.out.println("------Menu------");
        System.out.println("1. View all the Customers");
        System.out.println("2. Add new Customers");
        System.out.println("3. Update Customers by ID");
        System.out.println("4. Delete Customers by ID");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            // fetch from table Customers
            String query = "SELECT * FROM Customers";
            Statement statement =  conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString("CustomerId")+"    "+rs.getString("FirstName")+"   "+ rs.getString("LastName")+"    "+ rs.getString("Email"));
            }
            break;

            case 2:
            //add into the database
            System.out.println("Enter your first name:");
            String firstname=scanner.next();
            System.out.println("Enter your last name:");
            String lastname=scanner.next();
            System.out.println("Enter your email:");
            String email=scanner.next();
            System.out.println("Enter your phone:");
            String phone=scanner.next();

            PreparedStatement preparedStatement=conn.prepareStatement("Insert into customers(FirstName,LastName,Email,Phone) values(?,?,?,?)");
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.executeUpdate();
            break;

            case 3:
            System.out.println("Enter the ID of the customer you want to update:");
            String id=scanner.next();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url, username, password);

            // Create an SQL update statement
            String sql = "UPDATE mytable SET firstname=?, lastname=?, email=?, phone=? WHERE id=?;";
            PreparedStatement prestate = conn.prepareStatement(sql);

            // Set values to the statement
            // prestate.setString(1, firstname);
            // prestate.setString(2, lastname);
            // prestate.setString(3, email);
            // prestate.setString(4, phone);

            // Execute the SQL update statement
            int rowsUpdated = prestate.executeUpdate();
            if(rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("Failed to update data!");
            }
            System.out.println("Update customers");
            break;

            case 4:
            // query="Select * from Customers where id=?";
            // Statement statement1=conn.createStatement();
            System.out.println("Enter Customer ID:");
            int id=scanner.nextInt();
            prepa

            



            break;
            default:
            System.out.println("Invalid Input!, teska baje!");
        }
        }
    }
}
