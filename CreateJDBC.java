import java.sql.*;

class CreateJDBC {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/learnjdbc";
			String username = "root";
			String password = "Vk*1234567890";

			Connection con = DriverManager.getConnection(url, username, password);
			String q = "Create Table team (ID int(20) PRIMARY key auto_increment, Name varchar(20), Dep varchar(20))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table creted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}