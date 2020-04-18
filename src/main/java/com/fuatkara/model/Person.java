package com.fuatkara.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private final UUID id;
	private final String name;

	//name id gibi propertyleri json olarak gostercek
	public Person(
			@JsonProperty("id") UUID id, 
			@JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
