package com.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;
import com.blog.payloads.PostDto;
@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{
	List<Post> findbyUser(User user);
	List<Post> findbyCategory(Category category);
	List<Post> findByTitleContaining(String title);

}
