
public class Vehicle {

	public enum Surface {LAND, WATER,AIR};
	protected Surface rideOn;
	protected double price;
	
	public Surface getRideOn() {
		return rideOn;
	}
	public void setRideOn(Surface rideOn) {
		this.rideOn = rideOn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
