package com.br.ayrton.course.service;

import com.br.ayrton.course.entities.Category;
import com.br.ayrton.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    //retorna todos as categorias
    public List<Category> findAll(){
        return repository.findAll();
    }

    //retorna a categoria por id
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
