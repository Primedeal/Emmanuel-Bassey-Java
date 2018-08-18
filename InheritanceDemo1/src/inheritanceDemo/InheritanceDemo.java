package inheritanceDemo;

public class InheritanceDemo {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.setvalues(5, 8, 10);
		triangle.setvalues(8, 12, 18);
		
	System.out.println("the area of a rectangle is " + rectangle.area());
	System.out.println("the area of a triangle is " + triangle.area());
		
	}

}
