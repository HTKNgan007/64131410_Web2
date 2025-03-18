package vn.nganha.SB_Login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	//Hien thi form dang nhap
	@GetMapping("/login")
	public String LoginForm(Model model) {
		model.addAttribute("message", "");
		return "login";
	}
	
	//Xu ly
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String Login(HttpServletRequest request, Model model) {
//		//Lay du lieu
//		String dn = request.getParameter("id");
//		String mk = request.getParameter("password");
//		
//		if(dn.equals("NganHa") && mk.equals("Ngan710")) {
//			return "aboutme";
//		} else {
//			model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu.\n Đăng nhập thất bại!!");
//		}
//		return "login";
//	}
	
	// Xu ly
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(HttpServletRequest request, Model m) {
		// Lay du lieu
		String dnString = request.getParameter("id");
		String mkString = request.getParameter("mk");
		m.addAttribute("user", dnString);
		return "chaodn";
	}
	
}
