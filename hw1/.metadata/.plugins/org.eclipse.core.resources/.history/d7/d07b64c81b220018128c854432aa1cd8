
public class VehicleFactory {
	
	public CreateVehicle getVehicle(String type){
		if(type.equalsIgnoreCase("CAR")){
			return  new CreateCar();
		}
		else if(type.equalsIgnoreCase("BOAT")){
			return new CreateBoat();
		}
		else if(type.equalsIgnoreCase("HELICOPTER")){
			return new CreateHelicopter();
		}
		else{

			throw new IllegalArgumentException();
		}
	}
}
