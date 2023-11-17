package haikm.project.facebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import haikm.project.facebook.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
    
}
