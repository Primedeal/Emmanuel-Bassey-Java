import com.Autos.New.Brand.Cars;
//import com.Autos.New.Brand.Vehicle;

public class SuperTest {

	public static void main(String[] args) {
		Cars cr = new Cars();
		cr.model= "toyota";
		cr.colors= "silver";
		cr.make="camry";
		
		cr.price=50000;
		
		cr.start();
		cr.stop();
		
		cr.speedMeter();
			
	}

}
