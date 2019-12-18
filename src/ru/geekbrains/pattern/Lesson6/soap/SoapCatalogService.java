package ru.geekbrains.pattern.Lesson6.soap;


import com.soap.test_soap.entities.Customer;
import com.soap.test_soap.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SoapCatalogService {
@Autowired
private CustomerRepository customerRepository;

    public List<Customer> findAllByTimeBetween(LocalDate startDate, LocalDate stopDate){
        List<Customer> list = new ArrayList<>();
        customerRepository.findAllByPurchaseDateBetween(startDate, stopDate).forEach(e -> list.add(e));
        return list;
    }

    
}
