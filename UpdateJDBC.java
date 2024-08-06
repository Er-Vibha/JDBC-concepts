import java.sql.*;
import java.io.*;

public class UpdateJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/learnjdbc";
            String username = "root";
            String password = "Vk*1234567890";
            
            Connection con = DriverManager.getConnection(url, username, password);
            String s = "update team set name=?, dep=? where id=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new name:");
            String name = br.readLine();
            System.out.println("Enter new dep:");
            String dep = br.readLine();
            System.out.println("Enter ID");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, name);
            ps.setString(2, dep);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("Done......");
            con.close();
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
