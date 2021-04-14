package com.mega.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiniController {
	
	@Autowired
	MiniDAO dao;
	
	@RequestMapping("mini2.mega")
	public void create(MiniVO bag, MiniDAO dao) throws Exception {
		dao.create(bag);
	}
}
