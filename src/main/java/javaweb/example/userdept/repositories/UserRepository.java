package javaweb.example.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import javaweb.example.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
