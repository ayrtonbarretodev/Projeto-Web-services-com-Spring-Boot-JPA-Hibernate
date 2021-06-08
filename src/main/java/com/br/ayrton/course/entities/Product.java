package com.br.ayrton.course.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

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
}
