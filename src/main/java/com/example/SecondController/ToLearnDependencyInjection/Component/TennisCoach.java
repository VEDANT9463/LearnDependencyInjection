package com.example.SecondController.ToLearnDependencyInjection.Component;

import com.example.SecondController.ToLearnDependencyInjection.Interface.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }
}
