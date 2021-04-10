package org.sam.blog.controller;

import org.sam.blog.model.Blog;
import org.sam.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public List<Blog> getAllBlog(){
        return blogService.findAll();
    }

    @PostMapping("/blog")
    public Blog createBlog(@RequestBody Blog blog){
        return blogService.save(blog);
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> getBlogByid(@PathVariable Integer id){
        return blogService.findById(id);
    }
}
