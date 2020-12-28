
import zoo.*;

public class Entry {

	public static void main(String[] args) {
		Animal lion = new Animal("Lion", 200.34d,10.3d, 150, true);
		Animal gazelle = new Animal("Gazelle", 150.22, 8.2d, 200, false);

		lion.sprint();
		gazelle.sprint();
		
		lion.sprint();
		gazelle.sprint();
		
		gazelle.eat();
		
		System.out.println(gazelle);
		
		lion.eat(gazelle);
		
		System.out.println(gazelle);
		System.out.println(lion);
	}

}
