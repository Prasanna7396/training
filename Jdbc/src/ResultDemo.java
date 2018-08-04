import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {

	public static void main(String[] args) {
		Connection con = null;
		String sql = "select *from product";

		try {
			con = JdbcUtil.getConnection();
			ResultSet rs = con.createStatement().executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for (int c = 1; c <= meta.getColumnCount(); c++)
				System.out.println(meta.getColumnName(c) + "\t");
			System.out.println();

			while (rs.next())
				System.out.printf("%5d\t%-15s\t%5s\n",rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
