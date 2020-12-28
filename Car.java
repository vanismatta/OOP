package Cars;
public abstract class Car implements Drive{

	private boolean park;
	
	protected String model;
	protected int current_speed;
	protected int weight;
	protected float acceleration_factor;
	
	public Car() {
		//by default, all cars are in park with 0 speed
		park = true;
		current_speed = 0;
	}

	//Getter Methods
	public boolean isParked() {
		return this.park;
	}
	
	public int getCurrendSpeed() {
		return this.current_speed;
	}
	
	//put car in drive
	public void shiftToDrive() {
		this.park = false;
	}
	
	public void shiftToPark() {
		if(this.current_speed > 0) {
			System.out.println("Car is in motion, can't put into park until speed is 0");
			return;
		}
		this.park = true;
	}
	
	//Implementations for Drive Interface
	public void pressGasPedal() {
		//for simplicity, we will say that pressing on the
		//gas pedal will increase the speed by 
		//current_speed += weight * acceleration_factor
		
		if(this.park) {
			System.out.println("Car is in park, can't accelerate");
			return;
		}
		
		//we will truncate the float * int results
		this.current_speed += (int) (this.weight * this.acceleration_factor);
		
		//All cars have an assumed max speed of 120 mph
		if(this.current_speed > 120) {
			this.current_speed = 120;
		}
	}
	
	public void pressBrakePedal() {
		//for simplicity, we will say that pressing on the
		//brake pedal will decrease the speed by 
		//current_speed -= weight * acceleration_factor
		
		this.current_speed -= (int) (this.weight * this.acceleration_factor);
		
		if(this.current_speed < 0) {
			this.current_speed = 0;
		}
	}
	
	public String toString() {
		String result = "";
		result += "Car Model: " + this.model + "\n";
		result += "Weight: " + this.weight + "\n";
		result += "Acceleration Factor: " + this.acceleration_factor + "\n";
		result += "Current Speed: " + this.current_speed + "\n";
		result += "Car is in Park: " + this.park + "\n";
		return result;
	}
}
