package org.sam.blog.service;

import org.sam.blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CommentService extends JpaRepository<Comment, Integer> {
}
