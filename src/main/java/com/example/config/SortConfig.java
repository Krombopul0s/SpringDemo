package com.example.config;

import com.example.service.Coach;
import com.example.service.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    This configuration bean creates our instance of our swim coach class. Creating our swimCoach class and using this configuration
    class is a way of making something available as a bean for our application. This would be good for making 3rd party
    code available for your spring app because you may not have access to that source code to add @Component to it. For instance,
    if you used AWS S3 for file storage, you cannot just add @Component to Amazon's code, but you could make a configuration class
    that creates a Bean for you app that accesses the storage system so you could then use that Bean in your app.
 */
@Configuration
public class SortConfig {
    @Bean//("aquatic") <-- you can use a custom bean id in place of "swimCoach" in the qualifier of our DemoController
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
