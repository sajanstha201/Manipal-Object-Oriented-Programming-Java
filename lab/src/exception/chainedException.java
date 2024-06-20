package exception;

public class chainedException {
	public static void main(String [] args) {
		int a;
		try {
			a=4/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Throwable e1=new NullPointerException();
			e.initCause(new Exception("hello",new NullPointerException("sajan")));
			System.out.println(e.getCause().getMessage());
			System.out.println(e.getCause().getCause().getMessage());
		}
	}

}
