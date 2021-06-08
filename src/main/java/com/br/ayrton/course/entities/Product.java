package com.br.ayrton.course.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;

    @Getter  @Setter private String name;
    @Getter  @Setter private String description;
    @Getter  @Setter private Double price;
    @Getter  @Setter private String imgUrl;

    /* O uso do Set é essencial para garantir que não vai ter um produto com mais de uma ocorrência da mesma categoria
    * Pois o mesmo produto não pode participar de mais de uma categoria*/
    @Transient
    @Getter private Set<Category> categories = new HashSet<>();

    public Product(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}
