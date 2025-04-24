package com.mysite.exam.people;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PeopleService {

	private final PeopleRepository peopleRepository;
	
	public List<People> getList(){
		return peopleRepository.findAll();
	}
	
	public People getPeople(String beid) {
		Optional<People> people = this.peopleRepository.findById(beid);
		return people.get();
	}
}
