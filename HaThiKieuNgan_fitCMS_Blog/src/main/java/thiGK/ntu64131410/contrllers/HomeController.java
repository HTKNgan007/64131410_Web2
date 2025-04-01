package thiGK.ntu64131410.contrllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64131410.models.Page;
import thiGK.ntu64131410.models.Post;


@Controller
public class HomeController {
ArrayList<Page> dsPage = new ArrayList<>();
ArrayList<Post> dsPost = new ArrayList<>();
	
	public HomeController() {
		dsPage.add(new Page("1", "Home", "home, index", "Welcome to Home Page", "0"));
        dsPage.add(new Page("2", "About", "about, info", "About Us Page Content", "0"));
        dsPage.add(new Page("3", "Services", "services, offers", "Our Services", "0"));
        dsPage.add(new Page("4", "Contact", "contact, reach", "Contact Information", "0"));
        dsPage.add(new Page("5", "Blog", "blog, articles", "Latest Blog Posts", "0"));

        dsPost.add(new Post("1", "Introduction to Java", "Java is a popular language.", "101"));
        dsPost.add(new Post("2", "Spring Boot Guide", "Spring Boot makes development easy.", "102"));
        dsPost.add(new Post("3", "Thymeleaf in Spring", "Thymeleaf is a powerful template engine.", "103"));
        dsPost.add(new Post("4", "Database Connectivity", "Connecting to MySQL using Spring Boot.", "104"));
        dsPost.add(new Post("5", "REST API with Spring", "Building RESTful APIs in Spring Boot.", "105"));

    }

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/page/all")
	public String PageList(ModelMap m) {
		m.addAttribute("dsPage", dsPage);
		return "page/pageList";
	}
	
	@GetMapping("/page/new")
    public String AddNewPage() {
        return "page/new";
    }

	@PostMapping("/page/add")
    public String addPage(@RequestParam("pageName") String pageName,
                          @RequestParam("keyword") String keyword,
                          @RequestParam("content") String content,
                          @RequestParam("parentPageId") String parentPageId) {
        String newId = String.valueOf(dsPage.size() + 1);
        Page newPage = new Page(newId, pageName, keyword, content, parentPageId);
        dsPage.add(newPage);
        return "redirect:/pageList";
    }

    @GetMapping("/page/delete/{id}")
    public String deletePage(@PathVariable("id") String id) {
        dsPage.removeIf(page -> page.getId().equals(id));
        return "redirect:/page/all";
    }

    @GetMapping("/page/edit/{id}")
    public String editPage(@PathVariable("id") String id, ModelMap model) {
        for (Page page : dsPage) {
            if (page.getId().equals(id)) {
                model.addAttribute("page", page);
                break;
            }
        }
        return "editPage";
    }

    @PostMapping("/page/update")
    public String updatePage(@RequestParam("id") String id,
                             @RequestParam("pageName") String pageName,
                             @RequestParam("keyword") String keyword,
                             @RequestParam("content") String content,
                             @RequestParam("parentPageId") String parentPageId) {
        for (Page page : dsPage) {
            if (page.getId().equals(id)) {
                page.setPageName(pageName);
                page.setKeyword(keyword);
                page.setContent(content);
                page.setParentPageId(parentPageId);
                break;
            }
        }
        return "redirect:/page/all";
    }

//    @PostMapping("/addStudent")
//    public String addStudent(@RequestParam("mssv") String mssv,
//                             					@RequestParam("hoTen") String hoTen,
//                             					@RequestParam("diemTB") double diemTB) {
//        SinhVien newStudent = new SinhVien(mssv, hoTen, diemTB);
//        dsSinhVien.add(newStudent);
//        return "redirect:/studentList"; 
//    }
//    
//    @GetMapping("/delete/{mssv}")
//    public String deleteStudent(@PathVariable("mssv") String mssv) {
//        dsSinhVien.removeIf(sv -> sv.getMssv().equals(mssv));
//        return "redirect:/studentList";
//    }
//
//    @GetMapping("/edit/{mssv}")
//    public String editStudent(@PathVariable("mssv") String mssv, ModelMap model) {
//        for (SinhVien sv : dsSinhVien) {
//            if (sv.getMssv().equals(mssv)) {
//                model.addAttribute("student", sv);
//                break;
//            }
//        }
//        return "editStudent";
//    }
//
//    @PostMapping("/updateStudent")
//    public String updateStudent(@RequestParam("mssv") String mssv,
//                                @RequestParam("hoTen") String hoTen,
//                                @RequestParam("diemTB") double diemTB) {
//        for (SinhVien sv : dsSinhVien) {
//            if (sv.getMssv().equals(mssv)) {
//                sv.setHoTen(hoTen);
//                sv.setDiemTB(diemTB);
//                break;
//            }
//        }
//        return "redirect:/studentList";
//    }
    
}
