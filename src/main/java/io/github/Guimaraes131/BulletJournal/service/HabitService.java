package io.github.Guimaraes131.BulletJournal.service;

import io.github.Guimaraes131.BulletJournal.model.Habit;
import io.github.Guimaraes131.BulletJournal.repository.HabitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HabitService {

    private final HabitRepository repository;

    public void create(Habit habit) {
        repository.save(habit);
    }

    public List<Habit> index() {
        return repository.findAll();
    }
}
