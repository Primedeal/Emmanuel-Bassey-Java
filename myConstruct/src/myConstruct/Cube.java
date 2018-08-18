package myConstruct;
/*
 * This is a Class Constructor in java. Constructor in Java involves creating 
 * both the main class and a return class separately. 
 * The return class must have the same name as the class.
 */
public class Cube { 
	double length;
	double breadth;
	double width;
	
	public double getCubeVolume() {
		return (length*breadth*width);
		
	}
		Cube(){
			length = 5.5;
			breadth = 2.5;
			width = 10.0;
		}	
		Cube(double l, double b, double w){
			length = l;
			breadth = b;
			width = w;
			
			
		}
	}