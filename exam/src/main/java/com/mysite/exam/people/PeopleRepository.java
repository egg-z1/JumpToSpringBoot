package com.mysite.exam.people;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, String>{

	Optional<People> findByName(String name);

}
