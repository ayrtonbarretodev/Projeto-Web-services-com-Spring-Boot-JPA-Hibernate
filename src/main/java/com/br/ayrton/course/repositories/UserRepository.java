package com.br.ayrton.course.repositories;

import com.br.ayrton.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
