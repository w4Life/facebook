package haikm.project.facebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import haikm.project.facebook.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {
    
}
