package vn.nganha.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //Bảo rằng đây là 1 lớp controller
public class ChaoController {

	//action method
	//Url gọi action
	@GetMapping("/chao")
	public String xin_Chao(ModelMap model) {
		//Code xử lí ở đây
		model.addAttribute("tb", "Xin Chào nhé <3");
		return "helloView";
	}
}
