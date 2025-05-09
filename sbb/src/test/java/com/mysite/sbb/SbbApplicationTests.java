package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
//    
//    @Test
//    void testJpa() {        
//        Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // 두번째 질문 저장
//    }
    
//    @Test
//    void testJpa() {
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Question q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//    }
    
//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }
//    }
    
//    @Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1, q.getId());
//    }
    
//    @Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubjectAndContent(
//                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//        assertEquals(1, q.getId());
//    }
    
//    @Test
//    void testJpa() {
//        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//    }
    
//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);
//    }
    
//    @Test
//    void testJpa() {
//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());
//    }

//    @Autowired
//    private AnswerRepository answerRepository;
//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }
    
//    @Test
//    void testJpa() {
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
//    }
    
//    @Transactional
//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        List<Answer> answerList = q.getAnswerList();
//
//        assertEquals(1, answerList.size());
//        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
//    }
    
//   @Autowired
//   private StudentsRepository studentsRepository;
//
//    @Test
//    void testJpa() {
//    	// 학생 데이터 저장
//        Students student1 = new Students();
//        student1.setStid("2214440");
//        student1.setAdd("서울특별시 용산구 청파로");
//        student1.setGrade(4);
//        student1.setName("김지현");
//        student1.setGmemo("나는 홍길동이고 취미는 등산입니다. 책읽는것도 아주 좋아 합니다.");
//        studentsRepository.save(student1);
//
//        Students student2 = new Students();
//        student2.setStid("2110659");
//        student2.setAdd("서울특별시 용산구 청파로");
//        student2.setGrade(4);
//        student2.setName("최선호");
//        student2.setGmemo("나는 홍길동이고 취미는 등산입니다. 책읽는것도 아주 좋아 합니다.");
//        studentsRepository.save(student2);
//        
//
//        Students student3 = new Students();
//        student3.setStid("2222222");
//        student3.setAdd("서울특별시 용산구 청파로");
//        student3.setGrade(4);
//        student3.setName("sss");
//        student3.setGmemo("나 취미는 등산입니다. 책읽는것도 아주 좋아 합니다.");
//        studentsRepository.save(student3);

//        Students q = this.studentsRepository.findByName("김지현");  
//    	System.out.println("ID: " + q.getStid());
//    	System.out.println("이름: " + q.getName());
//    	System.out.println("학년: " + q.getGrade());
//    	System.out.println("주소: " + q.getAdd());
//    	System.out.println("메모: " + q.getGmemo());
//    	
//        assertEquals("2214440", q.getStid());
//        
//        Optional<Students> oq = this.studentsRepository.findById("2214440");
//    	if(oq.isPresent()) {
//    		Students q2 = oq.get();
//    		assertEquals("김지현",q2.getName());
//    	}
//    }
    
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }
    }
}
