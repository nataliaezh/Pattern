package ru.geekbrains.pattern.Lesson6.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "purchase_item")
    private int purchase_item;
    @Column(name = "count")
    private int count;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "purchase_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate purchase_date;

    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchase;

}
