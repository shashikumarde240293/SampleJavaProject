package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	
	public List<Person> getAll(){
		
		return repo.findAll();
	}
}
