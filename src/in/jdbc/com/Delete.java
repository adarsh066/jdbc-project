package in.jdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			String sql = "DELETE FROM tests WHERE ID=4";
			stmt.execute(sql);
			System.out.println("Check DB Test Deleted Successfully !");
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
