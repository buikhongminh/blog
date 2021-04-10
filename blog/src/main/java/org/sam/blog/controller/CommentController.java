package org.sam.blog.controller;

import org.sam.blog.model.Comment;
import org.sam.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment")
    public List<Comment> getAllComment(){
        return commentService.findAll();
    }

    @PostMapping("/comment")
    public Comment createComment(@RequestBody Comment comment){
        return commentService.save(comment);
    }

    @GetMapping("/comment/{id}")
    public Optional<Comment> getCommentById (@PathVariable Integer id){
        return commentService.findById(id);
    }

    @DeleteMapping("/comment/{id}")
    public void deleteCommentById(@PathVariable Integer id){
        commentService.deleteById(id);
    }
}
