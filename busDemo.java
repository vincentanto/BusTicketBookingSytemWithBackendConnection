package busRes;
import java.util.*;
import java.sql.*;
public class busDemo {
public static void main(String args[]) throws SQLException {
     budDAO busdao = new budDAO();
     busdao.getBusInfo();
	
	int userOpt=1;
	Scanner sc = new Scanner(System.in);
	while(userOpt==1) {
		System.out.println("Enter/n1.To Book Ticket \n2.To Exit");
		
		userOpt=sc.nextInt();
		if(userOpt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable()) {
				BookindDAO bookingDAO = new BookindDAO();
				bookingDAO.addBooking(booking);
				
			}else {
				System.out.print("Filled :) proceed with other bookings " );
			}
		}
	}
}
}
