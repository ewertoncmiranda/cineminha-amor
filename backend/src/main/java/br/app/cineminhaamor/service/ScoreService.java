package br.app.cineminhaamor.service;

import br.app.cineminhaamor.dto.MovieDTO;
import br.app.cineminhaamor.dto.ScoreDTO;
import br.app.cineminhaamor.entities.Movie;
import br.app.cineminhaamor.entities.Score;
import br.app.cineminhaamor.entities.User;
import br.app.cineminhaamor.repository.MovieRepository;
import br.app.cineminhaamor.repository.ScoreRepository;
import br.app.cineminhaamor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class ScoreService {

    @Autowired
    MovieRepository movieRepository ;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ScoreRepository scoreRepository;


    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO){
        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if (Objects.isNull(user)){
            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();
        Score score = new Score() ;

        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreDTO.getScore());
        score = scoreRepository.saveAndFlush(score);

        double sum = 0 ;
        for ( Score s1 : movie.getScores() ){
            sum = sum + score.getValue();
        }

        double average = sum / movie.getScores().size();
        movie.setScore(average);
        movie.setCount(movie.getScores().size());
        return  new MovieDTO(movieRepository.save(movie));
    }
}
