import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JDBCTable {

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		

		String sql = "insert into Student(id,uname, role) values(1,'ABC','Admin')";
		PreparedStatement preparedstatement = (PreparedStatement) connection.prepareStatement(sql);

		int rowsaffected = preparedstatement.executeUpdate();
		System.out.println(rowsaffected);

	}

}
