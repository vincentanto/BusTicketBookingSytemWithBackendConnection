package busRes;
import java.util.Date;
import java.sql.*;

public class BookindDAO {
public int bookingCount(int busNo,Date date ) throws SQLException {
	Connection con =dbConnection.getConnection();
	String query="select count(passenger_name) from booking where bus_no = ? and travel_date=?";
	PreparedStatement pst = con.prepareStatement(query);
    java.sql.Date sqlDate= new java.sql.Date(date.getTime())	;
	pst.setInt(1,busNo);
	pst.setDate(2, sqlDate);
	ResultSet rs = pst.executeQuery();
	rs.next();
	return rs.getInt(1);
}
public void addBooking(Booking booking) throws SQLException {
	Connection con =dbConnection.getConnection();
	String query="insert into booking values(?,?,?)";
	PreparedStatement pst =con.prepareStatement(query);
	pst.setString(1, booking.name);
	pst.setInt(2,booking.busNo);
	java.sql.Date sqlDate= new java.sql.Date(booking.date.getTime());
	pst.setDate(3, sqlDate);
	pst.executeUpdate();
	
}
}
