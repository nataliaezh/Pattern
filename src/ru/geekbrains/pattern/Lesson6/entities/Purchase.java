package ru.geekbrains.pattern.Lesson6.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name="purchase")
public class Purchase implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "purchase_id")
    private Customer customer;


}
