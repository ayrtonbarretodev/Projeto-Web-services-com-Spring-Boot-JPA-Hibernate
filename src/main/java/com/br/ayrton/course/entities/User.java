package com.br.ayrton.course.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
