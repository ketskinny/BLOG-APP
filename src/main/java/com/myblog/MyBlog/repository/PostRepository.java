package com.myblog.MyBlog.repository;

import com.myblog.MyBlog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
