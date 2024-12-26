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
	private QuestionService questionService;
	
	@Autowired
	private AnswerRepository answerRepository;
	

	@Test
	void contextLoads() {
		
		
//		Question q1 = new Question();
//		q1.setSubject("게시판을 만드는 방법은3333?");
//		q1.setContent("매우 쉽습니다3333.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);

//		//DB에 데이터 대량 넣기
//		for (int i=0; i<=300 ; i++) {
//			String subject = String.format("테스트 데이트입니다[%03d]", i);
//			String content = "내용 없음";
//			this.questionService.create(subject, content);
//		}

		
		
	}

}
