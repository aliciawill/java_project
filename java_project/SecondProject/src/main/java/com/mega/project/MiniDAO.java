package com.mega.project;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MiniDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void create(MiniVO bag) throws Exception {
		my.insert("mini.insert", bag);
	}

}
