public class Vehicle{
private String vehicleName;
private String vehicleColor;
private int acceleration=0;
private int decceleration=0;
private boolean ignition;
private int gear;


public void setVehicleName(String vehicleName){
	this.vehicleName=vehicleName;
}
public String getVehicleName(){
	return vehicleName;
}

public void setVehicleColor(String vehicleColor){
	this.vehicleColor=vehicleColor;
}
public String getVehicleColor(){
	return vehicleColor;
}

public void  toggle(){
		if(ignition==false){
			ignition=true;	
		System.out.println("the car ignition is " + this.ignition);}
		else{ ignition=false;
		System.out.println("the car ignition is  " + this.ignition);}
	}
	public boolean getIgnition(){	
		return ignition;
	}
	public void setIgnition(boolean ignition){
		this.ignition=ignition;
	}
	public void setGear(int gear){
		this.gear=gear;
	}
	public int getGear(){
		return gear;
	}

	public void changeGear(int gear){
		if(ignition==true && gear==0||gear==1||gear==2||gear==3)
		this.gear=gear;
		if(ignition==false &&  gear==0||gear==1||gear==2)
			{ this.gear=3;
				System.out.println("The ignition is turned off");}
	else{System.out.println("Enter a valid gear i.e 0,1,2,3");}
	}
public void setAcceleration(int acceleration){
	if(ignition==true && gear==1||gear==2 && acceleration<180)
		{this.acceleration=acceleration;}
	if(ignition==true && gear==0||gear==3)	
		{System.out.println("Please check the gear");}
	if(ignition==false && gear==3)	
		{this.acceleration=0;
			System.out.println("the ignition has been turned off");}
	if(acceleration>180)
		{this.acceleration=0;
			System.out.println("please enter a valid number between 0-180");}
			
}
public int getAcceleration(){
	return acceleration;
}

public void increaseAcceleration(int acceleration){
if(ignition==true && acceleration==9 && gear==1||gear==2 && acceleration<180)
		{this.acceleration=acceleration++;}
	if(ignition==true && gear==0||gear==3)	
		{System.out.println("Please check the gear");}
	else{System.out.println("Enter 9 to increase and 8 to decrease");}
	if(ignition==false && acceleration==9)	
		{this.acceleration=0;
			System.out.println("the ignition has been turned off");}
	if(acceleration>180)
		{System.out.println("MAXIMUM ACCELERATION REACHED!!!!!");}

}

public void decreaseAcceleration(int decceleration){
if(ignition==true && decceleration==8 && gear==1||gear==2 && acceleration>0)
		{this.acceleration=acceleration--;}
	if(ignition==true && gear==0||gear==3)	
		{System.out.println("Please check the gear");}
	else{System.out.println("Enter 9 to increase and 8 to decrease");}
	if(ignition==false && decceleration==8)	
		{	this.acceleration=0;
			System.out.println("the ignition has been turned off");}
	if(acceleration>180)
		{
			System.out.println("MINIMUM ACCELERATION REACHED!!!!!");}

}


}