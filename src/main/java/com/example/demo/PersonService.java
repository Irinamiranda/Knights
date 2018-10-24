package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service

public class PersonService {
    public PersonService() {
        list = new ArrayList<>();
    }

    private ArrayList<Person> list;



    public ArrayList<Person> getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }
    public void add(Person p)
    {
        list.add(p);
    }


}
