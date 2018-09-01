package myConstruct;

public class MyConstruct {

	public static void main(String[] args) {
	
		Cube Cubeobject = new Cube();
		System.out.println(Cubeobject.getCubeVolume());
		
		Cube Cubeobject2 = new Cube(5.0, 6.5,4.5);
		System.out.println(Cubeobject2.getCubeVolume());
	}
}
