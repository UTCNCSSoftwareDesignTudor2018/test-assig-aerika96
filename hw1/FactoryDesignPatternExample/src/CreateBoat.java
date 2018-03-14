
public class CreateBoat implements CreateVehicle{

	@Override
	public void create() {
		Boat bVehicle = new Boat();
		System.out.println("This is a boat, running on "+bVehicle.getRideOn()+", with the price "+bVehicle.getPrice());
		
	}
	
}
