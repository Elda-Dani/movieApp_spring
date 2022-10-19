package com.nestdigital.moviebackendApp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "movies")
public class MovieModel {
   @Id
   @GeneratedValue
    private int id;
    private String moviename;
    private String releaseddate;
    private String language;

    public MovieModel(int id, String moviename, String releaseddate, String language) {
        this.id = id;
        this.moviename = moviename;
        this.releaseddate = releaseddate;
        this.language = language;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getReleaseddate() {
        return releaseddate;
    }

    public void setReleaseddate(String releaseddate) {
        this.releaseddate = releaseddate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
