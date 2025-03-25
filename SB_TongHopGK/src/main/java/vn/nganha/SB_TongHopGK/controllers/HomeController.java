package vn.nganha.SB_TongHopGK.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import vn.nganha.SB_TruyenDuLieuSangView.models.Student;

@Controller
public class HomeController {

	ArrayList<Student> dsSinhVien = new ArrayList<>();
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	
	@GetMapping("/studentList")
	public String List() {
		return "studentList";
	}
	public String studentList(ModelMap m) {
		ArrayList<Student> dsSinhVien = new ArrayList<>();
		Student student1 = new Student("64131410", "Hà Thị Kiều Ngân", 2004, "Nữ");
		Student student2 = new Student("64131234", "Nguyễn Triệu Nam", 2003, "Nam");
		Student student3 = new Student("64131000", "Hồ Quốc Anh", 2002, "Nam");
		Student student4 = new Student("64137850", "Đào Quý Cường", 2001, "Nam");
		dsSinhVien.add(student1);
		dsSinhVien.add(student2);
		dsSinhVien.add(student3);
		dsSinhVien.add(student4);
		m.addAttribute("dsSV", dsSinhVien);
		return "profileListView";
}
