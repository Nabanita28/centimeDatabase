package com.ct.centimeDatabase.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public String color;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parentId")
    public List<UserDetails> children = new ArrayList<>();
}
