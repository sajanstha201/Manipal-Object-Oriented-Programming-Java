package exceptionHandling;

public class chainedException {
	public static void main(String [] args) {
		//ArithmeticException e=new ArithmeticException();
		////Exception f=new Exception();
		//f.initCause(e);
		//System.out.println(f.getCause().getMessage());
		String name="sajan";
		System.out.println(name.substring(3,4));
		char c='t';
		String s=Character.toString(c);
				
		s+=c;
		System.out.println(s.getClass());
		System.out.println(s);
		try {
			chainedException.add();
		}
		catch(Exception g) {
			Exception e=new Exception("deep khadka");
			e.initCause(g);
			System.out.println("kdjf");
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}
		finally {
			System.out.println("heeeeeeeee");
			System.out.println(~6);
		}
		A.add();
		chainedException.print(3,4,5,6,67);
		}
	static void add() throws Exception {
		throw new Exception("hello my name is sajan");
	}
	static void print(int ...a) {
		for(int e:a) {
			System.out.println(e);
		}
	}
}
class A{
	protected static void add() {
		System.out.println("THis is from class A add method");
	}
}
interface B{
	final int x=5;
	static int y=6;
	int z=4;
	void add();
	static void sub() {
		
	}
	abstract void div();
}
abstract class C{
	abstract void add();
	static void sub() {
		
	}
	final void div() {
		
	}
	C(){
		
	}
	static int x=5;
	final int y=5;
}
abstract class D extends C{
	
}
