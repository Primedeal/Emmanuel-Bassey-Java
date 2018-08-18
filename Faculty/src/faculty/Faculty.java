//CLASS and METHOD

// CLASS

package faculty;

public class Faculty {
String firstName;
String lastName;
int aptNumber;
String address;
int streetNumber;

public void display() {
	
	System.out.println("First name: " + firstName);
	System.out.println("Last name: " + lastName);
	System.out.println("Street number: " + streetNumber );
	System.out.println("Apt number: " + aptNumber );
	System.out.println("Address: " + address);
	
}

//METHOD

public static void main(String[]args) {
	Faculty F1 = new Faculty();
	F1.firstName = "Emmanuel";
	F1.lastName = "Bassey";
	F1.address = "Goreway Drive, Mississauga, Ontario, Canada L4T4H2";
	F1.streetNumber = 7340;
	F1.aptNumber = 209;
	F1.display();
}
}
