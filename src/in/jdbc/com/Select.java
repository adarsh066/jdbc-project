package in.jdbc.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM tests";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String short_description = rs.getString("short_description");
				System.out.println(id + " - " + name + " - " + short_description);
			}
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
