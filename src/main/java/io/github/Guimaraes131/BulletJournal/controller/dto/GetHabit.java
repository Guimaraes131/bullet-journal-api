package io.github.Guimaraes131.BulletJournal.controller.dto;

import io.github.Guimaraes131.BulletJournal.model.Bullet;
import io.github.Guimaraes131.BulletJournal.model.Habit;
import io.github.Guimaraes131.BulletJournal.model.enums.Metrics;

import java.util.List;

public record GetHabit(
        String name,
        Metrics metric,
        List<Bullet> bullets
) {

    public static GetHabit toDTO(Habit habit) {
        return new GetHabit(habit.getName(), habit.getMetric(), habit.getBullets());
    }
}
