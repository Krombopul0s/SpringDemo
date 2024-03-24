package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //Primary tells the constructor this is the bean to use for implementation if you don't specify a @Qualifier and have multiple Coaches
          //@Qualifier has a higher priority than @Primary so if you were to use @Qualifier with TrackCoach, it would ignore this Primary
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice.";
    }
}
