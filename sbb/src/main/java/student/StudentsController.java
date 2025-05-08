package student;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.sbb.question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/students")
@RequiredArgsConstructor
@Controller
public class StudentsController {
	private final StudentsService studentsService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Students> studentsList = this.studentsService.getList();
		model.addAttribute("studentsList", studentsList);
		return "students_list";
	}
}
