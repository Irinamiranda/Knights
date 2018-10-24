package com.example.demo;


import java.util.Random;

public class RandomQuestion {

    public static String getFeedback() {
        String[] feedbacks = {
                "What is your favorite color?",
                "What is the airspeed velocity of an unladen swallow?",

        };

        int randomIndex = new Random().nextInt(feedbacks.length);
        return feedbacks[randomIndex];
    }
}
