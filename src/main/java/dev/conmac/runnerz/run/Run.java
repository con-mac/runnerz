package dev.conmac.runnerz.run;
import java.time.DayOfWeek;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    DayOfWeek dayOfWeek,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer distance,
    Location location
    
) {}
