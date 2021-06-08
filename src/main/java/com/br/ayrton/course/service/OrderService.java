package com.br.ayrton.course.service;

import com.br.ayrton.course.entities.Order;
import com.br.ayrton.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    //retorna todos os usuários
    public List<Order> findAll(){
        return repository.findAll();
    }

    //retorna o usuário por id
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
