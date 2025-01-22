package com.example.SecondController.ToLearnDependencyInjection.Component;

import com.example.SecondController.ToLearnDependencyInjection.Interface.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }
}
