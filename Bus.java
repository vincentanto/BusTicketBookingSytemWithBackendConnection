package busRes;

public class Bus {
int busNo;
boolean ac;
int capacity;
Bus(int busNo,boolean ac,int capacity){
	this.busNo=busNo;
	this.ac=ac;
	this.capacity=capacity;
}
public int getCapacity() {
	return capacity;
}
public int getBusNo() {
	return busNo;
}
public void displayInfo() {
	System.out.println("BusNo : "+busNo+" Ac : "+ac+" Capacity : "+capacity);
}
}
