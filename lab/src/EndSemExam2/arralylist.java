package EndSemExam2;
import java.util.*;
public class arralylist {
public static void main(String [] args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("sajan");
	arr.add("deep");
	System.out.println(arr);
	String st="hello my name is sajan shrestha  g";
	String split[]=st.split(" ");
	for(String e:split) {
		System.out.println(e);
	}
	int a=5;
	Thread t=new Thread() {
		public void run() {
			int i;
			for(i=0;i<10;i++)
				if(i==a)
					System.out.println("my name is sajan shrestha");
		}
	};
	
	Thread t2=new Thread(()->{
		int i;
		for(i=0;i<10;i++)
			if(i==a)
				System.out.println("my name is sajan shrestha");
	});
	t.setName("sajan");
	System.out.println(t.getThreadGroup());
	System.out.println(t2);
	t.start();
	t2.start();
}
}