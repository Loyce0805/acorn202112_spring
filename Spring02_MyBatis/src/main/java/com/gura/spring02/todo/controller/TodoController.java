package com.gura.spring02.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.todo.dto.TodoDto;
import com.gura.spring02.todo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	//할일 정보 수정 요청 처리
	@RequestMapping("/todo/update")
	public String update(TodoDto dto) {
		service.updateTodo(dto);
		return "todo/update";
	}
	
	//할일 수정 폼 요청 처리
	@RequestMapping("/todo/updateform")
	public ModelAndView updateform(int num, ModelAndView mView) {
		
		service.getTodo(num, mView);
		
		mView.setViewName("todo/updateform");
		return mView;
	}
	
	//할일 삭제 요청 처리
	@RequestMapping("/todo/delete")
	public String delete(int num) {
		service.deleteTodo(num);
		return "redirect:/todo/list.do";
	}
	
	//할일 추가 요청 처리
	@RequestMapping("/todo/insert")
	public String insert(TodoDto dto) {
		service.addTodo(dto);
		return "todo/insert";
	}
	
	//할일 추가 폼 처리
	@RequestMapping("todo/insertform")
	public String insertform() {
		
		return "todo/insertform";
	}
	
	@RequestMapping("/todo/list")
	public ModelAndView list(ModelAndView mView) {
		service.getListTodo(mView);
		mView.setViewName("todo/list");
		return mView;
	}
	
	
	
}
