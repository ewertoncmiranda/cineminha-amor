package br.app.cineminhaamor.service;

import br.app.cineminhaamor.dto.MovieDTO;
import br.app.cineminhaamor.entities.Movie;
import br.app.cineminhaamor.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;



    public MovieDTO findById (Long id){

        Movie movie = repository.findById(id).get();
        return new MovieDTO(movie);


    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> all = repository.findAll(pageable);
        return all.map(MovieDTO::new);
    } ;


}
