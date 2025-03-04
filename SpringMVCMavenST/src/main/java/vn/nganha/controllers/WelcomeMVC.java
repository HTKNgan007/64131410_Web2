package vn.nganha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeMVC {
	@RequestMapping("/")
	public String getPage() {
		return "welcome";
	}
}
