package com.br.ayrton.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter  private Long id;
    @Getter  @Setter private String name;
    @Getter  @Setter private String email;
    @Getter  @Setter private String phone;
    @Getter  @Setter private String password;

    @JsonIgnore
    @OneToMany (mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
