package com.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestBookController {
	@RequestMapping("/list")
	public String list() {
		return null;
	}

}
