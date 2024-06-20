package exception;

public class excet {
public static void main(String args []) {
	try {
		add();
	}
	catch(ArithmeticException e) {
		System.out.println("Arihtmetic Exception");
	}
	catch(Exception e) {
		System.out.println("exception");
	}

}
static void add() throws Exception, ArithmeticException{
	throw new Exception();
}
}
