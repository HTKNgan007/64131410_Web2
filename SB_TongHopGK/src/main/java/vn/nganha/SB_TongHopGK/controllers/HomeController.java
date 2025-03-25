package vn.nganha.SB_TongHopGK.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import vn.nganha.SB_TongHopGK.models.SinhVien;

@Controller
public class HomeController {

	ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	
	@GetMapping("/studentList")
	public String List(ModelMap m) {
		SinhVien student1 = new SinhVien("64131410", "Hà Thị Kiều Ngân", 8);
		SinhVien student2 = new SinhVien("64131234", "Nguyễn Triệu Nam", 7);
		SinhVien student3 = new SinhVien("64131000", "Hồ Quốc Anh", 9);
		SinhVien student4 = new SinhVien("64137850", "Đào Quý Cường", 6.5);
		dsSinhVien.add(student1);
		dsSinhVien.add(student2);
		dsSinhVien.add(student3);
		dsSinhVien.add(student4);
		m.addAttribute("dsSV", dsSinhVien);
		return "studentList";
	}
}
