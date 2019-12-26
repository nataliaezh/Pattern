package ru.geekbrains.pattern.homework_Lesson7;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LencesRepository extends CrudRepository<Lences,Long> {
    List<Lences>findAllByPrice(int price);
    List<Lences> findAllByIdBetween(Long minId, Long maxId);


}
