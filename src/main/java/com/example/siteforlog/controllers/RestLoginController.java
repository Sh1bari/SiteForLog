package com.example.siteforlog.controllers;

import com.example.siteforlog.models.Post;
import com.example.siteforlog.repo.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginController {
    private final PostRepository postRepository;

    public RestLoginController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/rest/post")
    public Iterable<Post> rest(){
        Iterable<Post> posts = postRepository.findAll();
        return posts;
    }
}
