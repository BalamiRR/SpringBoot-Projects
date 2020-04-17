package com.fuatkara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fuatkara.dao.PersonDao;
import com.fuatkara.model.Person;

@Service	 
public class PersonService {

	private final PersonDao personDao;

	//PersonService Constructor, PersonDao yu autowired yapiyoruz.
	//FakePersonDataAccess deki PersonDao yu cagriyor.
	@Autowired  
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}

	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}
}