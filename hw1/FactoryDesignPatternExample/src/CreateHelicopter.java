
public class CreateHelicopter implements CreateVehicle{

	@Override
	public void create() {
		Helicopter hVehicle = new Helicopter();
		System.out.println("This is a helicopter, running on "+hVehicle.getRideOn()+", with the price "+hVehicle.getPrice());
		
		
	}

}
