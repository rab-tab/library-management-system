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
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false,unique = true)
    private String name;

    @ManyToMany(mappedBy = "publishers",cascade = CascadeType.ALL)
    private Set<Book> books=new HashSet<>();
}
