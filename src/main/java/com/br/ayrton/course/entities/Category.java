package com.br.ayrton.course.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;

    @Getter  @Setter private String name;

    //@ManyToMany
    @Transient
    @Getter private Set<Product> products = new HashSet<>();


    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
