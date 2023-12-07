package busRes;

import java.sql.*;

public class budDAO {
public void getBusInfo() throws SQLException{
	Connection con = dbConnection.getConnection();
	String query="Select * from bus";
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	while(rs.next()) {
		System.out.println("BusId:"+rs.getInt(1)+"  Ac:"+(rs.getInt(2)==1 ? "YES":"NO ")+"  Capacity:"+rs.getInt(3));
	}
}
public int getCapacity(int id) throws SQLException{
	Connection con = dbConnection.getConnection();
	String query="select capacity from bus where id ="+id;
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	rs.next();
	return rs.getInt(1);
}
}
