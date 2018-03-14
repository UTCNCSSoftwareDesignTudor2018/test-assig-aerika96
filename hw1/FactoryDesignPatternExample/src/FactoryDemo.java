import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDemo {

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		VehicleFactory factory =  new VehicleFactory();
		System.out.println("What type of vehicle do you need?");
		
		try {
			String input = br.readLine();
			CreateVehicle crt = factory.getVehicle(input);
			crt.create();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e){
			System.out.println("No such type");
		}
	}
}
