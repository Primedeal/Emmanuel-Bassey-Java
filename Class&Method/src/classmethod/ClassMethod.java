package classmethod;

public class ClassMethod {
int length;
int breadth;
int height;

 public void displayVolume() {
	int displayVolume = (length*breadth*height);
	
	System.out.println(displayVolume);

}
 public static void main(String[]args) {
	 ClassMethod cm1 = new ClassMethod();
	 cm1.length = 10;
	 cm1.breadth = 5;
	 cm1.height = 15;
	 cm1.displayVolume();
 
}
}
