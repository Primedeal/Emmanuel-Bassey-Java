package myClass;

public class MyClass {

	public static void main(String[] args) {
	
	Students	Studentsobject = new Students();
		
		Studentsobject.id = 10001;
		Studentsobject.name = "Tome";
		Studentsobject.age = 15;
		Studentsobject.sex = 'm';
		
		System.out.println(Studentsobject.name + " is " + Studentsobject.age + " years old, " + " m with student id " + Studentsobject.id);
	}

}
