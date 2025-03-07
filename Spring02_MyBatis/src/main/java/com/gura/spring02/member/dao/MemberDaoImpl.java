package com.gura.spring02.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.member.dto.MemberDto;

//spring 이 생성해서 관리하는 bean 이 될수 있도록 적절한 어노테이션을 붙여준다.
@Repository
public class MemberDaoImpl implements MemberDao{
	
	//필요한 핵심의존 객체를 필드로 선언하고 @Autowired 어노테이션을 붙여준다.
	@Autowired
	private SqlSession session;
	
	@Override
	public List<MemberDto> getList() {
		/*
		 *  Mapper's namespace : member
		 *  sql's id : getList
		 *  resultType : MemberDto 
		 */
		List<MemberDto> list=session.selectList("member.getList");
		return list;
	}

	@Override
	public void insert(MemberDto dto) {
		
	}

}







