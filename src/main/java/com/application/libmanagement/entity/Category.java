package com.application.libmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false,unique = true)
    private String name;

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    private Set<Book> books=new HashSet<>();

}
