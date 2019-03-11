package service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		persons.add(p);

		Person p1 = new Person();
		p1.setId("2");
		p1.setAge(25);
		p1.setFirstName("Tom");
		p1.setLastName("Brown");
		persons.add(p1);
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}