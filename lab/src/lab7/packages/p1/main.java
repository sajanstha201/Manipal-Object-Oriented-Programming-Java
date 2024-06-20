package lab7.packages.p1;
import lab7.myPackages.p1.*;
public class main {
public static void main(String [] args) {
	Maximum M=new Maximum();
	System.out.println("The maximum among 1,2,3 is "+M.max(1,2,3));
	System.out.println("The maximum among 5.0,7.0,9.0 is "+M.max(5.0,7.0,9.0));
}
}
