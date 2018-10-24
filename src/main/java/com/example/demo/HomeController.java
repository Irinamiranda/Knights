package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
@Autowired
PersonService people;

@RequestMapping("/")
public String showPeople(Model model){
//{
//
//    Person p = new Person();
//    Person p = new Person("Irina","magic","violet red");
//    people.add(p);
//
//    p = new Person();
//    p.setName("What is your name?");
//    p.setQuest("What is your quest?");
//    p.setFavColor("What is your favorite color?");
//
//    people.add(p);
//
    model.addAttribute("people",people.getList());
    return "index";
}
@RequestMapping("/addperson")
public String addPerson(Model model)
{
    model.addAttribute("personObject",new Person());
    model.addAttribute("randQuestion",new RandomQuestion());
    return "addperson";
}


    @RequestMapping("/saveperson")
    public String savePerson(@ModelAttribute("personObject") Person toSave)
    {
        System.out.println(toSave);
        people.add(toSave);
        return "newDirection";
    }


}
