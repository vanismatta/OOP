package Cars;

public class TeslaModel3 extends Car {

	private boolean super_mode;

	public TeslaModel3() {
		super();
		this.acceleration_factor = (float) 0.12;
		this.weight = 275;
		this.model = "Tesla Model 3";
		super_mode = false;
	}

	public void enableSuperMode() {
		super_mode = true;
		this.acceleration_factor = (float) 0.2;

	}

	public void pressGasPedal() {
		super.pressGasPedal();

		if (super_mode = false) {
			if (this.current_speed > 65) {
				this.current_speed = 65;
			}
		}
	}
}
