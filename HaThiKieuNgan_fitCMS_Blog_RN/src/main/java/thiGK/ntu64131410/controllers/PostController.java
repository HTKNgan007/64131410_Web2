package thiGK.ntu64131410.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64131410.models.Post;

@Controller
public class PostController {
	
ArrayList<Post> dsPost = new ArrayList<>();
	
	public PostController() {
        dsPost.add(new Post("1", "Introduction to Java", "Java is a popular language.", "101"));
        dsPost.add(new Post("2", "Spring Boot Guide", "Spring Boot makes development easy.", "102"));
        dsPost.add(new Post("3", "Thymeleaf in Spring", "Thymeleaf is a powerful template engine.", "103"));
        dsPost.add(new Post("4", "Database Connectivity", "Connecting to MySQL using Spring Boot.", "104"));
        dsPost.add(new Post("5", "REST API with Spring", "Building RESTful APIs in Spring Boot.", "105"));
    }

	@GetMapping("/post/all")
    public String PostList(ModelMap m) {
        m.addAttribute("dsPost", dsPost);
        return "post/all";
    }

    @GetMapping("/post/new")
    public String AddNewPost() {
        return "post/new";
    }

    @PostMapping("/post/add")
    public String addPost(@RequestParam("title") String title,
                          @RequestParam("content") String content,
                          @RequestParam("categoryId") String categoryId) {
        String newId = String.valueOf(dsPost.size() + 1);
        Post newPost = new Post(newId, title, content, categoryId);
        dsPost.add(newPost);
        return "redirect:/post/all";
    }
    
    @GetMapping("/post/view/{id}")
    public String viewPost(@PathVariable("id") String id, ModelMap model) {
        for (Post post : dsPost) {
            if (post.getId().equals(id)) {
                model.addAttribute("post", post);
                break;
            }
        }
        return "post/view";
    }

    @GetMapping("/post/delete/{id}")
    public String deletePost(@PathVariable("id") String id) {
        dsPost.removeIf(post -> post.getId().equals(id));
        return "redirect:/post/all";
    }
}
