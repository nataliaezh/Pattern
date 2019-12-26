package ru.geekbrains.pattern.Lesson6.repositories;

import com.soap.test_soap.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    String findAllByPurchaseDateBetween(LocalDate startDate, LocalDate stopDate);



    }

