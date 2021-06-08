package com.br.ayrton.course.repositories;

import com.br.ayrton.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
