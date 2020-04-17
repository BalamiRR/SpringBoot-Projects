package com.fuatkara.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import com.fuatkara.model.Person;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
	//Person class'imizi cagirdik, personlarimizi listelemek icin
	//adinada DB dedik
	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		//Person class'indan geliyor getName();
		//id.getId() yok cunku biz id'yi random yaptik
		//id yukaridaki paramatreden geliyor.
		DB.add(new Person(id, person.getName()));
		return 1;
	}

	@Override
	public List<Person> selectAllPeople() {
		return DB;
	}

}
