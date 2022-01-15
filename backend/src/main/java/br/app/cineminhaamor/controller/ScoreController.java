package br.app.cineminhaamor.controller;

import br.app.cineminhaamor.dto.MovieDTO;
import br.app.cineminhaamor.dto.ScoreDTO;
import br.app.cineminhaamor.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/scores")
@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody  ScoreDTO dto){ return scoreService.saveScore(dto);   }

}
