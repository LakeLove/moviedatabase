package com.imdb.moviedatabase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MoviedatabaseEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String movieName;

    public MoviedatabaseEntity(Long id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
