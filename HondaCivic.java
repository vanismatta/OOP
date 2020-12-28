package Cars;

public class HondaCivic extends Car {
	
	public HondaCivic() {
		super();
		this.acceleration_factor = 0.0625f;
		this.weight = 200;
		this.model = "Honda Civic";
	}

	
	@Override
	public void pressGasPedal() {
		//Call the base class method to set state
		super.pressGasPedal();
		
		//Honda Civic has a max speed of 90 mph
		if(this.current_speed > 90) {
			this.current_speed = 90;
		}
	}
}
