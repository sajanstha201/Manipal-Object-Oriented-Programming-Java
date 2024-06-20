package lab8;
public class InvalidMonthException extends Exception{
	InvalidMonthException(){
		super();
	}
	InvalidMonthException(String message){
		super(message);
	}
	public String getMessage() {
		return "Invalid Month";
	}
}