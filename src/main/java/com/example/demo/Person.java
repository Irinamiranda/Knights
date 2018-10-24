package com.example.demo;

public class Person {

    private String name;
    private String quest;
    private String question;

    public Person(){

    }

    public Person(String name, String quest, String question) {
        this.name = name;
        this.quest = quest;
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                " Quest: " + quest + "\n" +
               " Question: " + question + "\n";
    }
}
