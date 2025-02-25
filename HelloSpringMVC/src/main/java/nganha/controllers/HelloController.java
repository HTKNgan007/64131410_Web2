package nganha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
	//URL cho action này tính từ root
	@RequestMapping("say-hi")
	public String SayHello() {
		// code xử lí
		return "chao"; // view sẽ là file chao
	}
}
