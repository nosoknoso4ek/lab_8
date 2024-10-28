package ru.barmina.SpringBootEducation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.barmina.SpringBootEducation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}