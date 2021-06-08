package com.br.ayrton.course.repositories;

import com.br.ayrton.course.entities.Category;
import com.br.ayrton.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
