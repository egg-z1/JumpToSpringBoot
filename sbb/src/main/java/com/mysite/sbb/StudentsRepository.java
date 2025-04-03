package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, String>{
	Students findByStid(String stid);
	Students findByName(String name);
}
