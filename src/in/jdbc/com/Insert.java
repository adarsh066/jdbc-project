package in.jdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			String sql = "INSERT INTO tests(name, short_description) VALUES('Python', 'Python Test')";
			stmt.execute(sql);
			System.out.println("Check DB");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			DatabaseUtil.closeConnection(conn);
		}
	}
}
