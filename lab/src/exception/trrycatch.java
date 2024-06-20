package exception;

public class trrycatch {
	static int a=4,b=0,c;
	static void adder(){
		try {
			c=4/0;

		}
		catch(Exception e) {
			throw e;
		}
		finally {
			System.out.println("This is from finally adder method");
		}
		
	}
	public static void main(String [] args) {
		try {
			adder();
		}
		catch(Exception e) {
			System.out.println("This is from method throews ");
		}
		try {

			try {
				c=a/b;
			}
			catch(NullPointerException e) {
				System.out.println("This is from nested try");
			}
			String name=null;
			name.length();

		}
		catch(ArithmeticException e) {
			System.out.println("This is from main try arithmetic");
			System.out.println(e.getMessage());
			//throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("This is from main try null pointer");
			System.out.println(e.getMessage());
		}
		try {
			add();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		finally {
			//c=a/b;
		}
	}
		static void add() throws Exception,ArithmeticException{
			try {
				div1();
			}
			catch(Exception e) {
				throw new Exception(e);
			}
		}
		static void div1() throws Exception{
			try {
				div();
			}
			catch(Exception e) {
				throw new Exception(e);
			}
		}
		static void div() throws Exception{
			try {
				c=a/b;
			}
			catch(ArithmeticException e) {
				throw new Exception(e);
			}
		}
		/*
		try {
			add();
			System.out.println("TRY");
			String name=null;
			//c=a/b;
			if(name==null)
				throw new MyException("This is message when MyException object is create");
			///if(b==0)
			//	throw new ArithmeticException();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		String name=null;
		try {
			name.length();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			String names="sajan";
			int num=Integer.parseInt(names);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		int arr[]=new int[5];
		try {
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	static void add() throws Exception{
		int a=0;
		if(a==0)
			throw new MyException("This is from add method ");
	}
	static class MyException extends Exception{
		MyException(){
			super();
		}
		MyException(String message){
			super(message);
		}
		MyException(String message, Throwable cause){
			super(message,cause);
		}
		public String getMessage(){
			try {
				if(super.getMessage()==null)
					throw new Exception();
				return super.getMessage();	
			}
			catch(Exception e) {
				return "The string is null";
			}
		}
	}
			*/

}
