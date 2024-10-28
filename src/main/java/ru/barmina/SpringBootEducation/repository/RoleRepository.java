package ru.barmina.SpringBootEducation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.barmina.SpringBootEducation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
