package lab6;

public class lab6_2 {
public static void main(String args []) {
	EMPLOYEE emp=new EMPLOYEE("sajan shrestha",2000);
	emp.calculateSalary();
	emp.displayEmployeeDetails();
	FullTimeEmp fullemp=new FullTimeEmp("deep khadka",1000,200,100);
	fullemp.calculateSalary();
	fullemp.displayEMployeeDetails();
	PartTimeEmp partemp=new PartTimeEmp("devraj silwal",20);
	partemp.calculateSalary();
	partemp.displayEmployeeDetails();
}
}
class EMPLOYEE{
	String name;
	double basic,da,gross,net;
	EMPLOYEE(String name,double basic){
		this.name=name;
		this.basic=basic;
	}
	void calculateSalary() {
		this.da=0.52*this.basic;
		this.gross=this.basic+this.da;
		this.net=0.3*this.gross;
	}
	void displayEmployeeDetails() {
		System.out.println("Name: "+this.name+" Net Salary: "+this.net);
}
}
class FullTimeEmp extends EMPLOYEE{
	double bonus,deductions;
	FullTimeEmp(String name,double basic,double bonus,double deductions){
		super(name,basic);
		this.bonus=bonus;
		this.deductions=deductions;
	}
	void calculateSalary() {
		super.calculateSalary();
		this.net+=this.bonus-this.deductions;
	}
	void displayEMployeeDetails(){
		System.out.println("Name: "+this.name+" Net Salary: "+this.net);
	}
	
}
class PartTimeEmp extends EMPLOYEE{
	PartTimeEmp(String name,int hoursworked){
		super(name,0);
		this.hoursWorked=hoursworked;
	}
	int hoursWorked;
	double salary;
	final static double hourlyRate=1000;
	void calculateSalary(){
		this.salary=hourlyRate*hoursWorked;
	}
	void displayEmployeeDetails() {
		System.out.println("Name: "+this.name+"Hour worked: "+this.hoursWorked+" Salary: "+this.salary);
	}
}








