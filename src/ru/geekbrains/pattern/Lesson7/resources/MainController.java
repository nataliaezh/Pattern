package ru.geekbrains.pattern.Lesson7.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
1. Создать сущность «товар» (id, название, стоимость) и соответствующую таблицу в БД. Заполнить таблицу тестовыми данными (20 записей).
        2. Сделать страницу, в которую будут выведены эти записи.
        3. С помощью GET-запроса указывать фильтрацию по:
        a. только минимальной,
        b. только максимальной,
        c. или минимальной и максимальной цене.

 */
@Controller
public class MainController {
@Autowired
private LencesRepository lencesRepository;


    @Autowired
    private LencesServices lencesServices;
    @GetMapping("/")
    public  String index(){
        return "index";
    }

    @GetMapping("/lences")
        public String showLencesInfo(Model model) {
        model.addAttribute("lences", lencesServices.getAllLences());
        return "lences-info";
    }

    @GetMapping("/lences/{id}")
    public String showLenceDetails(Model model, @PathVariable(name="id") Long id){
        Lences lence = lencesServices.getLenceById(id);
        model.addAttribute("lences", lence);
        return "lence-details";
    }

    @GetMapping("/submit_form")
    public String getFormResult(@RequestParam(name = "word") String word, @RequestParam(name = "value") int value) {
        return "Word: " + word + "; Value = " + value + ";";
    }


    @GetMapping("/test_custom_method")
    @ResponseBody
    public List<Lences> testCustomMethod() {
        return lencesRepository.findAllByIdBetween(1L, 3L);
    }
 }

