public class Circle{
	private double radius;
	public Circle(){
		radius =1.0;
	}
	public Circle(double radius){
		this.radius= radius;
	}
	public void display(){
		System.out.println("The radius of the circle is : " + radius);
	}	
	public static void main(String[] args){
		Circle circle1 = new Circle();
		circle1.display();
		Circle circle2 = new Circle(2.5);
		circle2.display();
	}	
}