package com.example.controller;

import com.example.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency
    private Coach myCoach;

    /////define a constructor for dependency injection

    /*
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
    */


    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {          //@Qualifier specifies which coach to use if many
        myCoach = theCoach;
    }


    //get mapping says "get" this based on the /url and returns whatever is here
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    /////defines setter method for dependency injection

    /*
    @Autowired
    public void setCoach(Coach theCoach){ //"setCoach" method can be called anything because it is annotated as autowired
        myCoach = theCoach;
    }
    */

    /*
    @Autowired
    public void setCoach(@Qualifier("cricketCoach")Coach theCoach){ //@Qualifier can be used in setter injection as well
        myCoach = theCoach;
    }
     */

    /////field injection is not recommended anymore due to difficulty unit testing

    /*private Coach myCoach; <---- this is the field injection part: setting myCoach directly

     no constructor/setter used

     @GetMapping("/dailyworkout")
     public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
     }
     */

    /////post mapping says, when something is mapped to this, take the input, and run whatever is here and return something

    /*@PostMapping

     */
}