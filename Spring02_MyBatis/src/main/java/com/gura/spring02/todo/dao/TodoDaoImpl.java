package com.gura.spring02.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.todo.dto.TodoDto;

//spring이 생성해서 관리하는 bean이 될 수 있게
@Repository
public class TodoDaoImpl implements TodoDao{
	
	//필요한 핵심의존 객체를 필드로 선언하고 @Autowired 어노테이션
	@Autowired
	private SqlSession session;
	
	@Override
	public List<TodoDto> getList(){
		List<TodoDto> list=session.selectList("todo.getList");
		return list;
	}

	@Override
	public void insert(TodoDto dto) {
		session.insert("todo.insert", dto);
		
	}

	@Override
	public void delete(int num) {
		session.delete("todo.delete", num);
		
	}

	@Override
	public TodoDto getData(int num) {
		TodoDto dto=session.selectOne("todo.getData", num);
		return dto;
	}

	@Override
	public void update(TodoDto dto) {
		session.update("todo.update", dto);
		
	}
}
