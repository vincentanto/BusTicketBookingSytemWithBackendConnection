package busRes;
import java.sql.*;
public class dbConnection {
public static final String un="root";
public static final  String pwd = "root";
public static final  String url="jdbc:mysql://localhost:3306/busresv";
public static Connection getConnection() throws SQLException{
	return DriverManager.getConnection(url,un,pwd);
}
}
