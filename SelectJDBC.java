import java.sql.*;
import java.io.*;
public class SelectJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjdbc","root", "Vk*1234567890");
            String q="Select * from team";
            Statement st=con.createStatement();
            ResultSet set=st.executeQuery(q);
            while(set.next()){
                int id=set.getInt(1);
                String name=  set.getString(2);
                String dep=set.getString(3);
                System.out.println(name+":"+id+":"+dep); 
                }
                con.close();
        }
        catch (Exception err) {
            System.out.println(err);
        }
    }
}
