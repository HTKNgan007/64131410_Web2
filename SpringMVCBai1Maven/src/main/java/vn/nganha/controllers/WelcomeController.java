package vn.nganha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	//URL cho action này tính từ root
		@RequestMapping("/welcome")
		public String welcome() {
			// code xử lí
			return "viewWelcome"; // view sẽ là file viewWelcome
		}
}
