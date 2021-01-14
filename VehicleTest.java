import java.util.Scanner;
public class VehicleTest{
	public static void main (String[]args){
		Scanner input= new Scanner(System.in);
		Vehicle motor = new Vehicle();

		System.out.print("Enter the The name of the vehicle:");
		String getName=input.nextLine();
		motor.setVehicleName(getName);
		System.out.print("Enter the The color of the vehicle:");
		getName=input.nextLine();
		motor.setVehicleColor(getName);
		System.out.printf("The name of the vehicle is %s and the color of the vehicle is %s",motor.getVehicleName(),motor.getVehicleColor());
		System.out.println();
		motor.toggle();
		motor.toggle();
		System.out.print("Enter the gear of the vehicle 0 FOR NEUTRAL,1 FOR REVERSE,2 FOR DRIVE,3 FOR PARK:");
		int getG=input.nextInt();
		motor.changeGear(getG);
		System.out.printf("The gear is set at %d",motor.getGear());
		System.out.println();
		System.out.print("Set the acceleration:");
		getG=input.nextInt();
		motor.setAcceleration(getG);
		System.out.printf("The acceleration is set at %d",motor.getAcceleration());
		System.out.println();
		System.out.print("TO INCREASE THE ACCELERATION ENTER 9, TO DECCELERATE ENTER 8:");
		getG=input.nextInt();
		motor.increaseAcceleration(getG);
		motor.decreaseAcceleration(getG);
		System.out.printf("The acceleration is set at %d",motor.getAcceleration());

	}
}