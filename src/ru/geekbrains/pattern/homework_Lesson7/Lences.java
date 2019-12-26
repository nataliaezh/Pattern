package ru.geekbrains.pattern.homework_Lesson7;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "lences")
public class Lences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "manufacture")
    private String manufacture;

    @Column(name = "price")
    private int price;
}