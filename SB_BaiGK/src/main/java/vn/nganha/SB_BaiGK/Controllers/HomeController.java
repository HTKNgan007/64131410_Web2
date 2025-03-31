package vn.nganha.SB_BaiGK.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.nganha.SB_BaiGK.Models.SinhVien;


@Controller
public class HomeController {

ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
	
	public HomeController() {
        dsSinhVien.add(new SinhVien("64131410", "Hà Thị Kiều Ngân", 8));
        dsSinhVien.add(new SinhVien("64131234", "Nguyễn Triệu Nam", 7));
        dsSinhVien.add(new SinhVien("64131000", "Hồ Quốc Anh", 9));
        dsSinhVien.add(new SinhVien("64137850", "Đào Quý Cường", 6.5));
    }

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
		m.addAttribute("dsSV", dsSinhVien);
		return "studentList";
	}
	
	@GetMapping("/addNew")
    public String AddNew() {
        return "addNew";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam("mssv") String mssv,
                             					@RequestParam("hoTen") String hoTen,
                             					@RequestParam("diemTB") double diemTB) {
        SinhVien newStudent = new SinhVien(mssv, hoTen, diemTB);
        dsSinhVien.add(newStudent);
        return "redirect:/studentList"; 
    }
}
