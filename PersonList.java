package PersonProject;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	List<Person> listOfPersons = new ArrayList<Person>();
	
	public PersonList() {
		super();
		listOfPersons.add(new Person("Spyrus "," Tomaras"));
		listOfPersons.add(new Person("Agathi","Tomara"));
		listOfPersons.add(new Person("Stathis","Tomaras"));
		listOfPersons.add(new Person("Helen","Tomara"));
		
	}
	
	public void print() {
		for(Person p: listOfPersons) {
			System.out.format("\n %-10s %-10s", p.getFirstName(), p.getLastName());
		}
	}
	
}
