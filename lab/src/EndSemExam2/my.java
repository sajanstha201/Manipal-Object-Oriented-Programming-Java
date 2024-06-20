package EndSemExam2;
class CounterDemo{
	<T extends Comparable<T>> void bubbleSort(T[] data){ 
	for(int a=1; a < data.length; a++)
	for(int b=data.length-1; b >= a; b--){
		if(data[b-1].compareTo(data[b])>0){
			T x = data[b-1]; data[b-1] = data[b]; data[b] = x;
		}
		} 
	}
}
public class my {
public static void main(String [] args) {
	System.out.println("sajan ");
	CounterDemo c=new CounterDemo();
	Integer arr[]= {1,2,3,4,5};
	c.bubbleSort(arr);
}
}
