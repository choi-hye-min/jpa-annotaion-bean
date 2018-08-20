package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String email;
}
