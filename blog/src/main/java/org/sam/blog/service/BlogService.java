package org.sam.blog.service;

import org.sam.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlogService extends JpaRepository<Blog,Integer> {
}
