package com.mysite.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.mysite.exam.book.Book;
import com.mysite.exam.book.BookRepository;
import com.mysite.exam.people.People;
import com.mysite.exam.people.PeopleRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class ExamApplicationTests {
	
	@Autowired
	private PeopleRepository peopleRepository;
	@Autowired
	private BookRepository bookRepository;

	@Test
    @Transactional
    @Rollback(false)
	void TestJpa() {
		//Database 데이터를 넣는 코드
//		People p1 = new People();
//		p1.setBeid("220101");
//		p1.setName("홍길동");
//		p1.setAdd("서울시 강남구");
//		p1.setMemo("취미 등산");
//		this.peopleRepository.save(p1);
//		
//		People p2 = new People();
//		p2.setBeid("200202");
//		p2.setName("김순천");
//		p2.setAdd("서울시 강남구");
//		p2.setMemo("전직 동장");
//		this.peopleRepository.save(p2);
//
//		People p3 = new People();
//		p3.setBeid("210321");
//		p3.setName("홍나미");
//		p3.setAdd("서울시 강남구");
//		p3.setMemo("반납이 항상 늦음");
//		this.peopleRepository.save(p3);
//		
//		Book b1 = new Book();
//		b1.setBookname("채식주의자");
//		b1.setDyDate(LocalDateTime.now());
//		b1.setPeople(p2);
//		this.bookRepository.save(b1);
//		
//		Book b2 = new Book();
//		b2.setBookname("소년이 온다");
//		b2.setDyDate(LocalDateTime.now());
//		b2.setPeople(p2);
//		this.bookRepository.save(b2);
//		
//		Book b3 = new Book();
//		b3.setBookname("회복하는 인간");
//		b3.setDyDate(LocalDateTime.now());
//		b3.setPeople(p3);
//		this.bookRepository.save(b3);
		
		// 이름으로 조회하고 생년월일을 확인하는 코드
		Optional<People> personName = this.peopleRepository.findByName("홍길동");
		if(personName.isPresent()) {
			People person = personName.get();
			assertEquals("220101", person.getBeid()); //"220101"을 변경시 JUnit failure
		}
	}
}
