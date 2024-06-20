package lab8;
import java.util.*;
public class stack {
	int top=-1;
	final int max=10;
	int stackarr[]=new int[max];
	Scanner sc=new Scanner(System.in);
public static void main(String args []) {
	System.out.println("1.push\n2.pop\n3.display\n4.exit\n");
	stack stack=new stack();
	while(true) {
		int value;
		System.out.print("Enter a choice: ");
		value=stack.sc.nextInt();
		switch(value) {
		case 1:
			try {
				stack.push();
			}
			catch(Exception e){
				System.out.println(e.getMessage());	
			}
			break;
		case 2:
			try {
				stack.pop();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			stack.display();
			break;
		case 4:
			return;
		default:
			System.out.println("Invalid Choice\n");

		}
	}
}
void push() throws pushException {
	this.top++;
	if(this.isStackFull())
		throw new pushException("Stack is full");
	int value;
	System.out.println("Enter a element: ");
	value=sc.nextInt();
	this.stackarr[top]=value;
}
 void pop() throws popException{
	this.top--;
	if(this.isStackEmpty()) 
		throw new popException("Stack is empty");
}
boolean isStackFull() {
	if(this.top==max) {
		this.top--;
		return true;	
	}
	else 
		return false;
}
boolean isStackEmpty() {
	if(this.top<0) {
		this.top++;
		return true;
	}
	else
		return false;
}
void display() {
	int i;
	for(i=0;i<=this.top;i++) {
		System.out.print(this.stackarr[i]+" ");
	}
	System.out.println("");
}
}
