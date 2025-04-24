package com.mysite.test.user;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.test.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	
	public List<Student> getList(){
		return this.studentRepository.findAll();
	}
	
	public Student getStudent(Integer sId) {
		Optional<Student> student = this.studentRepository.findById(sId);
		if(student.isPresent()) {
			return student.get();
		}else {
			throw new DataNotFoundException("student not found");
		}
	}
	
	public void modify(Student student, String memo) {
//		Optional<Student> student = this.studentRepository.findById(sId);
//		if(student.isPresent()) {
//			Student s1 = student.get();
//			s1.setMemo(memo);
//			s1.setCreateDate(LocalDateTime.now());
//			this.studentRepository.save(s1);
//		} else {
//			throw new DataNotFoundException("student not found");
//		}
		student.setMemo(memo);
		student.setCreateDate(LocalDateTime.now());
		this.studentRepository.save(student);
	}
}
