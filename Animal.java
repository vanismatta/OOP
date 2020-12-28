package zoo;

public class Animal {

	private String name;
	private double weight;
	private double height;
	private double energy;
	private boolean predator;
	
	public Animal(String name, double weight,double height, 
						double energy, boolean predator) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.energy = energy;
		this.predator = predator;
	}
	
	public void makeSound() {
		System.out.println(this.name + " did not make a sound");
	}
	
	public void sprint() {
		double distance =  (this.height * this.energy *.1d) / this.weight;
		
		this.energy -= 10;
		
		System.out.println(this.name + " sprinted " + distance);
	}
	
	public void eat() {
		if(this.predator) {
			System.out.println("Predators must eat other animals");
			return;
		}
		this.energy += 10;
	}
	
	public void eat(Animal eaten_animal) {
		if(!this.predator) {
			System.out.println("Only predators can eat other animals");
			return;
		}
		this.energy += eaten_animal.energy * .5;
		eaten_animal.energy = 0;
		System.out.println(this.name + " ate " + eaten_animal.name);
	}
	
	public String toString() {
		String result = "";
		
		result += "Name: " + this.name + "\n";
		result += "Weight: " + this.weight + "\n";
		result += "Height: " + this.height + "\n";
		result += "Energy: " + this.energy + "\n";
		result += "Predator: " + this.predator + "\n";
		
		return result;
	}
}
