package com.mysite.midterm.lecture;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.midterm.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureService {
	private final LectureRepository lectureRepository;
	
	public List<Lecture> getList(){
		return lectureRepository.findAll();
	}
	
	public Lecture getLecture(Integer id) {
		Optional<Lecture> lecture = this.lectureRepository.findById(id);
		if(lecture.isPresent()) {
			return lecture.get();
		}else {
			throw new DataNotFoundException("lecture not found");
		}
	}

}
