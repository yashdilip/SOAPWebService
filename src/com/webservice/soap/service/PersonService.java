package com.webservice.soap.service;

import com.webservice.soap.beans.Person;

public interface PersonService {
	public boolean addPerson(Person p);		
	public boolean deletePersonById(int id);
	public Person getPersonById(int id);
	public Person[] getAllPersons();
}
