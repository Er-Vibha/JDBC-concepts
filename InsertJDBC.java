import java.sql.*;
class InsertJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/learnjdbc";
            String name = "root";
            String psw = "Vk*1234567890";
            Connection con = DriverManager.getConnection(url, name, psw);
            String q = "Insert into team(ID, Name, Dep) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Dev");
            pstmt.setString(3, "AI,ML");
            pstmt.executeUpdate();
            System.out.println("Inserted");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
