package io.github.Guimaraes131.BulletJournal.service;

import io.github.Guimaraes131.BulletJournal.controller.dto.PostHabit;
import io.github.Guimaraes131.BulletJournal.model.Habit;
import io.github.Guimaraes131.BulletJournal.repository.HabitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HabitService {

    private final HabitRepository repository;

    public void create(PostHabit dto) {
        Habit entity = dto.toEntity();

        repository.save(entity);
    }

    public List<Habit> index() {
        return repository.findAll();
    }
}
