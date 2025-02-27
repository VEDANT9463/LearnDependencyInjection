package com.example.SecondController.ToLearnDependencyInjection.Component;

import com.example.SecondController.ToLearnDependencyInjection.Interface.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }
}
