package br.app.cineminhaamor.repository;

import br.app.cineminhaamor.entities.Score;
import br.app.cineminhaamor.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
