package ru.geekbrains.pattern.Lesson7.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LencesServices {



    @Autowired
    private LencesRepository lencesRepository;

    public List<Lences>getAllLences(){
         return   (List<Lences>) lencesRepository.findAll();
    }

    public Lences getLenceById (Long id){
        return lencesRepository.findById(id).orElse(null);
    }
}
