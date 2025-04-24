package com.mysite.test;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.test.user.Student;
import com.mysite.test.user.StudentRepository;

@SpringBootTest
class TestApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

    @Test
    void testJpa() {       
        
        Student s1 = new Student();
        s1.setSId(2214440);
        s1.setUsername("김지현");
        s1.setAddress("서울특별시 용산구 청파동 ");
        s1.setGrade(4);
        s1.setMemo("컴퓨터특강 시험을 준비하고 있습니다. 시험보기싫지만 해야겠죠.");
        s1.setCreateDate(LocalDateTime.now());

        Student s2 = new Student();
        s2.setSId(1231321);
        s2.setUsername("김현");
        s2.setAddress("서별시 용산구 청파동 ");
        s2.setGrade(3);
        s2.setMemo("컴퓨터특험을 준비하고 니다. 시험보기싫지만 해야겠죠.");
        s2.setCreateDate(LocalDateTime.now());
       
        studentRepository.save(s1);
        studentRepository.save(s2);
        
    }
}
