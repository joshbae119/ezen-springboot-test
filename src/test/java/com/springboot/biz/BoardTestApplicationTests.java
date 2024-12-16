package com.springboot.biz;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.biz.question.Question;
import com.springboot.biz.question.QuestionRepository;
import com.springboot.biz.answer.AnswerRepository;
import com.springboot.biz.question.QuestionService;


@SpringBootTest
class BoardTestApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	

	@Test
	void contextLoads() {
		
		
		Question q1 = new Question();
		q1.setSubject("게시판을 만드는 방법은?");
		q1.setContent("매우 쉽습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		
		
	}

}
