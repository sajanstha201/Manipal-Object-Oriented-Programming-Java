package lab8;
public class SeatsFilledException extends Exception{
SeatsFilledException(){
	super();
}
public String getMessage() {
	return "Seat is full";
}
}
