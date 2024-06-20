package lab8;
public class InvalidDayException extends Exception{
	InvalidDayException(){
		super();
	}
	InvalidDayException(String message){
		super(message);
	}
	public String getMessage() {
		return "Invalid Day";
	}
}