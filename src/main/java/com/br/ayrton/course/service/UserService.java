package com.br.ayrton.course.service;

import com.br.ayrton.course.entities.User;
import com.br.ayrton.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //retorna todos os usuários
    public List<User> findAll(){
        return repository.findAll();
    }

    //retorna o usuário por id
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
