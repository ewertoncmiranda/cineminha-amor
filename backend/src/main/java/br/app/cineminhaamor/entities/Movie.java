package br.app.cineminhaamor.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="tb_movie")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @OneToMany(mappedBy = "id.movie")
    private Set<Score> scores = new HashSet<>();

    private String title ;
    private Double score ;
    private Integer count ;
    private String image ;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", scores=" + scores +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", count=" + count +
                ", image='" + image + '\'' +
                '}';
    }
}
