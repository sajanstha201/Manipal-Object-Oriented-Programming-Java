package lab6;

public class lab6_5 {
	public static void main(String args []) {
		Figure rectangle,triangle,square;
		rectangle=new Rectangle(10,20);
		triangle=new Triangle(10,20);
		square=new Square(5);
		System.out.println("The area of Figure are given below: ");
		System.out.println("Rectangle: "+rectangle.area()+"\nTriangle: "+triangle.area()+"\nSquare: "+square.area());
	}
}
abstract class Figure{
	Figure(double width,double height){
		this.width=width;
		this.height=height;
	}
	Figure(double length){
		this.length=length;
	}
	abstract double area();
	double width,height,length;
}
class Rectangle extends Figure {
	Rectangle(double width,double height){
		super(width,height);
	}
	double area() {
		return this.width*this.height;
	}
}
class Triangle extends Figure{
	Triangle(double width,double height){
		super(width,height);
	}
	double area() {
		return 0.5*this.width*this.height;
	}
}
class Square extends Figure{
	Square(double length){
		super(length);
	}
	double area() {
		return this.length*this.length;
	}
}