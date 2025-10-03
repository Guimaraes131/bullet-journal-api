package io.github.Guimaraes131.BulletJournal.repository;

import io.github.Guimaraes131.BulletJournal.model.Bullet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletRepository extends JpaRepository<Bullet, Long> {
}
