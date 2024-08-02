import java.sql.*;

class TestJDBC {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/learnjdbc";
			String username = "root";
			String password = "Vk*1234567890";

			Connection con = DriverManager.getConnection(url, username, password);
			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}