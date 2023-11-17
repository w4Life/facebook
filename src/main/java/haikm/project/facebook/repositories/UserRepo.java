package haikm.project.facebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import haikm.project.facebook.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
        
}
