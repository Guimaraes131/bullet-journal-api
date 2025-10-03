package io.github.Guimaraes131.BulletJournal.repository;

import io.github.Guimaraes131.BulletJournal.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Long> {
}
