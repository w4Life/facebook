package haikm.project.facebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import haikm.project.facebook.entities.Like;

public interface LikeRepo extends JpaRepository<Like, Integer> {
    
}
