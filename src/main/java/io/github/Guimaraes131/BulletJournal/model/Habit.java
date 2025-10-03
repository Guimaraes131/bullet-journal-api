package io.github.Guimaraes131.BulletJournal.model;

import io.github.Guimaraes131.BulletJournal.model.enums.Metrics;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_habit")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Metrics metric;

    @OneToMany(mappedBy = "habit")
    private List<Bullet> bullets;
}
