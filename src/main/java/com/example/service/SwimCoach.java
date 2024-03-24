package com.example.service;

//Note there is no "@Component annotation here, that is because this is for use with a configuration bean
public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim a 1000m as a warmup.";
    }
}
