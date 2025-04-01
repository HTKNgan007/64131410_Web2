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
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	
	
	
	@GetMapping("/addNew")
    public String AddNew() {
        return "addNew";
    }

    
}
