
public class CreateCar implements CreateVehicle {

	@Override
	public void create() {
		Car cVehicle = new Car();
		System.out.println("This is a car, running on "+cVehicle.getRideOn()+", with the price "+cVehicle.getPrice());
		
	}

}
