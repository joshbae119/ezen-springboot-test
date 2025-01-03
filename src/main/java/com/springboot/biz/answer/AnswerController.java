package com.springboot.biz.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.biz.question.Question;
import com.springboot.biz.question.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {
	
	private final QuestionService questionService;
	private final AnswerService answerService;
	
	//validation 적용 전
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, 
			@Valid AnswerForm answerForm, BindingResult bindingResult) {
		Question question =this.questionService.getQuestion(id);
		if(bindingResult.hasErrors()) {
			model.addAttribute("question", question);
			return "question_detail";
		}
		
		this.answerService.create(question, answerForm.getContent()); //답변을 등록저장
		return String.format("redirect:/question/detail/%s", id);
	}


	//validation 적용 후
//	@PostMapping("/create/{id}")
//	public String createAnswer(Model model, @PathVariable("id") Integer id, 
//			@Valid AnswerForm answerForm, BindingResult bindingResult ) {
//		Question question =this.questionService.getQuestion(id);
//		if(bindingResult.hasErrors()) {
//			model.addAttribute("question", question);
//			return "question_detail";
//		}
//		this.answerService.create(question, answerForm.getContent()); //답변을 등록저장
//		return String.format("redirect:/question/detail/%s", id);
//	}
	


}
