package dev.conmac.runnerz.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.util.Optional;


@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();
    private int id = 1; // Declare and initialize the variable "id"

    List<Run> findAll() {
        return runs;
    }


    Optional<Run> findById(Integer id) {
        return runs.stream()
            .filter(run -> run.id().equals(id))
            .findFirst()
            .map(Optional::ofNullable)
            .orElse(null);
    }

    void create(Run run) {
        runs.add(run);
    }


    @PostConstruct
    private void init() {
        runs.add(new Run(id++, 
            LocalDateTime.now().getDayOfWeek()," Morning Run",
            LocalDateTime.now(), 
            LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 
            10, 
            Location.OUTDOOR));
        runs.add(new Run(id++, 
            LocalDateTime.now().getDayOfWeek()," Evening Run",
            LocalDateTime.now(), 
            LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 
            10, 
            Location.OUTDOOR));
    }

}
