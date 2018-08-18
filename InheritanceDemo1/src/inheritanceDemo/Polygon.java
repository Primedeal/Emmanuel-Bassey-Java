package inheritanceDemo;
// A polygon is the parent of shapes such as rectangle, triangle, cone, cylinder etc 
// triangle, rectangle etc will always inherits some properties from their parent 
//(polygon) such as height, width, length and breadth which has to be protected.

public class Polygon {
	
	protected int height;
	protected int width;
	protected int length;
	public void setvalues(int a, int b, int c) {
				height = a;
				width = b;
				length = c;
	}
	
}
