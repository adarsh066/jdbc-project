package in.jdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			String sql = "UPDATE tests SET name='Core' WHERE ID=2";
			stmt.execute(sql);
			System.out.println("Check DB Test Updated Successfully !");
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
