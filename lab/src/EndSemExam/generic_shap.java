package EndSemExam;
class Shape{
	void area() {
		System.out.println("The area of Shape is 0");
	}
}
class Rectangle extends Shape{
	int length,bredth;
	Rectangle(int length,int bredth){
		this.length=length;
		this.bredth=bredth;
	}
	void area() {
		System.out.println("The are of Rectangle is "+this.length*this.bredth);
	}
}
class Triangle extends Shape{
	int height,base;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	void area() {
		System.out.println("The area of Triangle is "+this.height*this.base/2);
	}
}
class C<T>{
	T t[];
}
class BoundedGen<T extends Shape>{
	static <W> void adds(W w){
		System.out.println(w);
	}
	T x[];
	void main() {
	}
	BoundedGen(T ...t){
		this.x=t;
		for(T e:x) {
			e.area();
		}
	}
}
public class generic_shap {
	public static void main(String [] args) {
		BoundedGen<Shape> b=new BoundedGen<>(new Triangle(4,5),new Rectangle(3,4),new Rectangle(5,6));
		C <?> c[]=new C<?>[45];
		BoundedGen<?> d[]=new BoundedGen<?>[20];
		BoundedGen.adds(34);
	}
}
