package lab10;
public class stacks<T> {
public static void main(String [] args) {
	stacks<Employee> empStack=new stacks<>(new Employee[10]);
	stacks<Student> stdStack=new stacks<>(new Student[10]);
	empStack.push(new Employee(1));
	empStack.push(new Employee(2));
	empStack.pop();
	empStack.show();
	stdStack.push(new Student(1));
	stdStack.push(new Student(2));
	stdStack.pop();
	stdStack.show();
	}
	
	int top=-1,max;
	T stack[];
stacks(T stack[]){
	this.max=stack.length;
		this.stack=stack;
	}
void push(T t) {
	if(this.top==this.max) {
		System.out.println("Over flow");
		return;
	}
	else {
		top++;
		this.stack[top]=t;
	}
}
T pop() {
	return this.stack[this.top--] ;
}
void show() {
	int i;
	for(i=0;i<=this.top;i++)
		System.out.println(this.stack[i]+" ");
	System.out.println();
}
}
class Employee{
	public int id;
	Employee(int id){
		this.id=id;
	}
	int getid() {
		return id;
	}
	
}
class Student{
	int id;
	Student(int id){
		this.id=id;
	}
}
