import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Person {

	private String first_name;
	private String last_name;
	private int age;

	// Constructors
	public Person() {
		this.first_name = "Test";
		this.last_name = "Person";
		this.age = 18;
	}

	public Person(String first_name, String last_name, int age) {
		try {
			this.setFirstName(first_name);
			this.setLastName(last_name);
			this.setAge(age);
		} catch (Exception e) {
			this.first_name = "Test";
			this.last_name = "Person";
			this.age = 18;
		}

	}

	// first_name getter and setter functions
	public String getFirstName() {
		return this.first_name;
	}

	public void setFirstName(String first_name) throws Exception {
		if (first_name == null || first_name == "") {
			throw new Exception("first_name cannot be null or empty string");
		}
		this.first_name = first_name;
	}

	// last_name getter and setter functions
	public String getLastName() {
		return this.last_name;
	}

	public void setLastName(String last_name) throws Exception {
		if (last_name == null || last_name == "") {
			throw new Exception("last_name cannot be null or empty string");
		}
		this.last_name = last_name;
	}

	// age getter and setter functions
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("age cannot be less than zero");
		}
		this.age = age;
	}

	// toString function to display Person Object as a String
	public String toString() {
		String return_string = "";

		return_string += "First Name: " + this.first_name + "\n";
		return_string += "Last Name: " + this.last_name + "\n";
		return_string += "Age: " + this.age + "\n";

		return return_string;
	}

	/**
	 * 
	 * @param person_list - List of Person Objects to print to standard out
	 */
	public static void printPersonList(List<Person> person_list) {
		for (int i = 0; i < person_list.size(); i++) {
			System.out.println(person_list.get(i).toString());
		}
	}

	/**
	 * 
	 * @param filepath - File path to csv file that contains Person data to read
	 * @return - Person ArrayList containing csv person data
	 */
	public static ArrayList<Person> importFile(String filepath) {
		ArrayList<Person> person_list = new ArrayList<Person>();
		// Insert your code here...
		Path pathToFile = Paths.get(filepath);
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			String line = br.readLine();

			while (line != null) {
				String[] attributes = line.split(",");

				for (String a : attributes) {
					System.out.print(a + " ");
					;
				}
				Person person = new Person(attributes[0], attributes[1], Integer.parseInt(attributes[2]));
				person_list.add(person);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return person_list;
	}

	/**
	 * 
	 * @param filepath    - File path to write Person Object data to csv file
	 * @param person_list - Person Object ArrayList to write to file
	 */
	public static void exportFile(String filepath, ArrayList<Person> person_list)
			// Insert your code here...
			throws FileNotFoundException, IOException {
		Path path = Paths.get(
				"/Users/veronicaanismatta/Documents/Rutgers/Object Oriented Programming/Workspace2OOP/Assignment 6/src/person_list.csv");
		if (Files.exists(path)) {
			// file exist
			System.out.println("file exits");
		}

		if (Files.notExists(path)) {
			System.out.println("file doesn't exits");
		}

		Writer output = new BufferedWriter(new FileWriter(
				"/Users/veronicaanismatta/Documents/Rutgers/Object Oriented Programming/Workspace2OOP/Assignment 6/src/person_list.csv"));
		try {
			FileWriter csvwriter = new FileWriter(
					"//Users/veronicaanismatta/Documents/Rutgers/Object Oriented Programming/Workspace2OOP/Assignment 6/src/person_list.csv");
			csvwriter.append("FIRSTNAME");
			csvwriter.append(",");
			csvwriter.append("LASTNAME");
			csvwriter.append(",");
			csvwriter.append("AGE");
			csvwriter.append(",");
			csvwriter.append("\n");
			csvwriter.append("Henry");
			csvwriter.append(",");
			csvwriter.append("Shmeding");
			csvwriter.append(",");
			csvwriter.append("25");
			csvwriter.append("\n");
			csvwriter.append("Jack");
			csvwriter.append(",");
			csvwriter.append("Ryan");
			csvwriter.append(",");
			csvwriter.append("22");
			csvwriter.append("\n");
			csvwriter.append("Mary");
			csvwriter.append(",");
			csvwriter.append("Myers");
			csvwriter.append(",");
			csvwriter.append("18");
			csvwriter.append("\n");
			csvwriter.append("Jane");
			csvwriter.append(",");
			csvwriter.append("Doe");
			csvwriter.append(",");
			csvwriter.append("29");
			csvwriter.append("\n");
			csvwriter.append("Mark");
			csvwriter.append(",");
			csvwriter.append("Myers");
			csvwriter.append(",");
			csvwriter.append("19");
			csvwriter.append("\n");
			csvwriter.append("Matt");
			csvwriter.append(",");
			csvwriter.append("Clark");
			csvwriter.append(",");
			csvwriter.append(null);

			csvwriter.close();
			System.out.println("CSV file created succesfully.");
		} catch (Exception e) {
			System.out.println("exception :" + e.getMessage());
		}

	}
}
