import java.sql.*;
import java.io.*;
public class ImageSave {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjdbc","root","Vk*1234567890");
        String s="insert into imagesave(pic) values(?)";
        PreparedStatement ps=con.prepareStatement(s);
        FileInputStream fis=new FileInputStream("pic.jpg");
        ps.setBinaryStream(1,fis,fis.available());
        ps.executeUpdate();
        System.out.println("Pic Done!!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
