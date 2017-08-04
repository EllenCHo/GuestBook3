package com.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/add")
	public String add(@ModelAttribute GuestBookVo vo ) {
		dao.insert(vo);
		return "redirect:/list";
	}
	
	@RequestMapping("deleteform")
	public String deleteform(@RequestParam("no") int no, Model model) {
		model.addAttribute(no);
		return "deleteform";
	}

}
