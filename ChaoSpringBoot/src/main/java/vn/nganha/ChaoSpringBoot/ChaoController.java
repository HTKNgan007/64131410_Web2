package vn.nganha.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Bảo rằng đây là 1 lớp controller
public class ChaoController {

	//action method
	//Url gọi action
	@GetMapping("/chao")
	public String xin_Chao(/*Cac tham so*/) {
		//Code xử lí ở đây
		return "helloView";
	}
}
