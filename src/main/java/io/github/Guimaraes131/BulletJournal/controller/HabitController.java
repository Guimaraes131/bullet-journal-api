package io.github.Guimaraes131.BulletJournal.controller;

import io.github.Guimaraes131.BulletJournal.controller.dto.GetHabit;
import io.github.Guimaraes131.BulletJournal.controller.dto.PostHabit;
import io.github.Guimaraes131.BulletJournal.model.Habit;
import io.github.Guimaraes131.BulletJournal.service.HabitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/habit")
public class HabitController {

    private final HabitService service;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody PostHabit dto) {
        service.create(dto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<GetHabit>> index() {
        List<GetHabit> habits = service.index();

        return ResponseEntity.ok(habits);
    }
}
