package com.example.siteforlog.controllers;

import com.example.siteforlog.models.Post;
import com.example.siteforlog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final PostRepository postRepository;

    public LoginController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/login")
    public String login(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "login";
    }

    @GetMapping("/login/add")
    public String loginAdd(){
        return "loginAdd";
    }

    @PostMapping("/login/add")
    public String loginPostAdd(@RequestParam String login,
                               @RequestParam String password,
                               Model model){
        Post post = new Post(0, login, password);
        postRepository.save(post);
        return "redirect:/login";
    }

}
