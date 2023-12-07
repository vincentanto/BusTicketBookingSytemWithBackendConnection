package busRes;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
String name;
int busNo;
Date date;
Booking(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Passenger Name : ");
    name= sc.next();
    System.out.println("Enter BusNo :  ");
    busNo = sc.nextInt();
    System.out.println("Enter date in DD-MM-YY :");
    String dateInput=sc.next();
    SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yy");
    
    try {
    	date = simpleDate.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}
public boolean isAvailable()throws SQLException {
	budDAO busDAO = new budDAO();
	BookindDAO bookingDAO = new BookindDAO();
	int capacity=busDAO.getCapacity(busNo);
	int booked=bookingDAO.bookingCount(busNo, date);
	
	return booked<capacity;
}
}
