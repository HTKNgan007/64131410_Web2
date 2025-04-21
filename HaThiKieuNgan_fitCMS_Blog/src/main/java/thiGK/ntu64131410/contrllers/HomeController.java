package thiGK.ntu64131410.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
}
