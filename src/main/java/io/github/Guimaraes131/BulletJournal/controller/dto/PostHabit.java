package io.github.Guimaraes131.BulletJournal.controller.dto;

import io.github.Guimaraes131.BulletJournal.model.Habit;
import io.github.Guimaraes131.BulletJournal.model.enums.Metrics;

public record PostHabit(
        String name,
        Metrics metric
) {

    public Habit toEntity() {
        return Habit.builder()
                .name(name)
                .metric(metric)
                .build();
    }
}
