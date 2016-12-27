package com.webservice.soap.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.webservice.soap.beans.Person;

public class PersonServiceImpl implements PersonService{

	private static Map<Integer, Person> persons = new HashMap<Integer, Person>();
	
	@Override
	public boolean addPerson(Person p) {
		// TODO Auto-generated method stub
		if(persons.get(p.getId())!=null)
			return false;
		persons.put(p.getId(), p);
		return false;
	}

	@Override
	public boolean deletePersonById(int id) {
		// TODO Auto-generated method stub
		if(persons.get(id)==null)
			return false;
		persons.remove(id);
		return true;
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return persons.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		// TODO Auto-generated method stub
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}
}
