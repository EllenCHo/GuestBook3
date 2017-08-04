package com.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guestbook.dao.GuestBookDao;
import com.guestbook.vo.GuestBookVo;

@Controller
public class GuestBookController {
	@Autowired
	GuestBookDao dao;
	
	@RequestMapping("/list")
	public String list(Model model) {				//정보를 전달하기 위해 Model 객체를 받는다
		List<GuestBookVo> list = dao.getlist();
		model.addAttribute("list", list);
		return "list";
	}

}
