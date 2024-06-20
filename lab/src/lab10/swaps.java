package lab10;
public class swaps{
public static void main(String [] args) {
	String str[]= {"sajan","deep","devraj"};
	Integer inte[]= {1,2,3,4};
	swaps s=new swaps();
	System.out.println("Before swapping: ");
	s.print(str);
	s.print(inte);
	str=s.swap(str, 0, 1);
	inte=s.swap(inte, 0,1);
	System.out.println("After swapping: ");
	s.print(str);
	s.print(inte);
}
public <T> T[] swap(T t[],int i,int j) {
	T temp=t[i];
	t[i]=t[j];
	t[j]=temp;
	return t;
}
public <T> void print(T t[]) {
	for(T element:t) {
		System.out.print(element+" ");
	}
	System.out.println("");

}
}
