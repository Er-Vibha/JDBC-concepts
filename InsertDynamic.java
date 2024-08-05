import java.sql.*;
import java.io.*;
public class InsertDynamic {
    public static void main(String ar[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/learnjdbc";
            String name="root";
            String psw="Vk*1234567890";
            Connection con=DriverManager.getConnection(url,name,psw);
            String s="Insert into team(id, name, dep) values(?, ?, ?)";
            PreparedStatement pr=con.prepareStatement(s);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter id");
            int id=Integer.parseInt(br.readLine());
            System.out.println("Enter Name");
            String emp=br.readLine();
            System.out.println("Enter Department");
            String dep=br.readLine();
            pr.setInt(1, id);
            pr.setString(2,emp);
            pr.setString(3,dep);
            pr.executeUpdate();
            System.out.println("inserted");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
