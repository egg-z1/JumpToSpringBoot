package student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentsService {
	
	private final StudentsRepository studentsRepository;
	
	public List<Students> getList() {
		return this.studentsRepository.findAll();
	}
}
