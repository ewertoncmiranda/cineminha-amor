package br.app.cineminhaamor.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    ScorePK scorePK = new ScorePK();

    private Double value ;

    public void setMovie(Movie movie){
      this.scorePK.setMovie(movie);
    }

    public void setUser(User user){
     this.scorePK.setUser(user);
    }
}
