package com.mysite.midterm;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.mysite.midterm.lecture.Lecture;
import com.mysite.midterm.lecture.LectureRepository;
import com.mysite.midterm.student.Student;
import com.mysite.midterm.student.StudentRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class MidtermApplicationTests {
	
	@Autowired
	private LectureRepository lectureRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Test
    @Transactional
    @Rollback(false)
	void TestJpa() {
		Lecture l1 = new Lecture();
		l1.setLname("강의이름");
		l1.setProfessor("교수이름");
		l1.setContent("강의의 소개입니다.");
		l1.setCreateDate(LocalDateTime.now());
		this.lectureRepository.save(l1);
		
		Lecture l2 = new Lecture();
		l2.setLname("강의이름2");
		l2.setProfessor("교수이름2");
		l2.setContent("강의의 소개입니다.2");
		l2.setCreateDate(LocalDateTime.now());
		this.lectureRepository.save(l2);
		
		Student s1 = new Student();
		s1.setSid(2214440);
		s1.setSname("학생이름");
		s1.setGrade(4);
		s1.setMajor("학생전공");
		s1.setCreateDate(LocalDateTime.now());
		s1.setLecture(l1);
		this.studentRepository.save(s1);
	}

}
