package vn.nganha.SB_GDModuleHoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
}
