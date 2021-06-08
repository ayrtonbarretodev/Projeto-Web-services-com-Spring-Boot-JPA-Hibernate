package com.br.ayrton.course.repositories;

import com.br.ayrton.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
