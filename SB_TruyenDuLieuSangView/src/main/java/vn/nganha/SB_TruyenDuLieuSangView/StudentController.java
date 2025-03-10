package vn.nganha.SB_TruyenDuLieuSangView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
	@GetMapping("/student")
    public String studentInfo(ModelMap model) {
        Student student = new Student("64131410", "Hà Thị Kiều Ngân", 2004, "Nữ");
        model.addAttribute("student", student);
        return "profileView";
    }
}
