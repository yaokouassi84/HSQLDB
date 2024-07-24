package fr.as.DbEmbarquee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.as.DbEmbarquee.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
