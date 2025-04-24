package com.mysite.midterm.student;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.midterm.lecture.Lecture;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	
	public void create(Lecture lecture, Integer sid, String sname, Integer grade, String major) {
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setGrade(grade);
		student.setMajor(major);
		student.setCreateDate(LocalDateTime.now());
		student.setLecture(lecture);
		this.studentRepository.save(student);
	}


	public void addExistingStudentToLecture(Lecture lecture, Integer sid) {
	    Optional<Student> optionalStudent = studentRepository.findById(sid);
	    if (optionalStudent.isPresent()) {
	        Student student = optionalStudent.get();
	        student.setLecture(lecture);
	        studentRepository.save(student); // 강의 설정 후 저장
	    } else {
	        // 나중에 예외 처리 메시지 추가 가능 (지금은 무시)
	        System.out.println("해당 학번의 학생이 존재하지 않습니다.");
	    }
	}



}
