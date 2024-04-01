package com.example.HibernateTest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;

    @Setter
    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "owner_house",
//            joinColumns = @JoinColumn(name = "owner_id"),
//            inverseJoinColumns = @JoinColumn(name = "house_id")
//    )
    private List<House> houses;
}
