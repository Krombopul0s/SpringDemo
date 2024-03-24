package com.example.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    /*  Every bean that is made by default is singleton meaning only one instance is created and any reference to that bean is
        referencing the same instance. PROTOTYPE creates a new instance for each container request. REQUEST is scoped to HTTP requests
        for web apps. SESSION is the same as REQUEST but for web sessions. GLOBAL-SESSION is scoped to global HTTP web sessions.

        NOTE about Prototype beans. They are lazy by default and destroy is not called by Spring for them so destruction lifecycle callbacks
        are not called (like @PreDestroy below)
     */
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }

    //LifeCycle methods
    /*
    @PostConstruct  //after the bean is made do this
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy     //before destroying bean do this
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());

     */
}
