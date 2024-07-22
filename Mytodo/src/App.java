
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class App {
        static Connection connection;
        static JFrame frame;
        static JTextField textField;
        static JButton button;
        static Statement statement;
        static DefaultTableModel tableModel;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //for connection
        String url="jdbc:mysql://localhost:3306/mytodo";
        String username="root";
        String password="021603";
        
        connection=DriverManager.getConnection(url,username,password);
        System.out.println("Database Connected");
        frame=new JFrame("My todo");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        
        textField=new JTextField(20);
        button=new JButton("Add");
        JPanel panel=new JPanel();
        panel.add(textField);
        panel.add(button);
        frame.add(panel, BorderLayout.NORTH);

        
        
        tableModel=new DefaultTableModel(new Object[]{"ID","Task","Completed"},0);
        tableModel.addRow(new Object[]{1,"Sleep","yes"});
        
        JTable table=new JTable(tableModel);
        JScrollPane scroll=new JScrollPane(table);
        frame.add(scroll,BorderLayout.SOUTH);

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(Mouse Event e){
                int selectedindex=table.getSelectedRow();
                System.out.println(table.getValueAt(selectedindex,1));

                String[] options=["yes","no"];
                JOptionPane.showOptionDialog(null,"Do you want to delete?","Deletion Confirm");
            }
            }
        });
        
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                addData();
        });
        
        loadData();
        frame.setVisible(true);
    }

    private static void loadData(){
        try {
            String query="SELECT * FROM mytodo";
            statement=connection.createStatement();
            statement.execute(query);
            ResultSet rows=statement.executeQuery(query);

            tableModel.setRowCount(0);
            
            while(rows.next()){
                tableModel.addRow(new Object[]{rows.getInt("id"),rows.getString("task"),
                rows.getInt("Completed")});
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void addData(){
        try {
            String input=textField.getText();
            if(input.equals(" ")) {
                return;
            }
        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO tabledos (task) values(?)");
        statement1.setString(1, input);
        statement1.executeUpdate();
        textField.setText(" ");
        loadData();
     
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Button is clicked");
    }
    
          
}
 