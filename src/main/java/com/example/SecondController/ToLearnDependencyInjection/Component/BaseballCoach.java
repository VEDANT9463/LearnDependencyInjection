package com.example.SecondController.ToLearnDependencyInjection.Component;

import com.example.SecondController.ToLearnDependencyInjection.Interface.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes in batting practice";
    }
}
