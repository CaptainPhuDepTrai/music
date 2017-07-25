package vn.edu.eiu.music.entity;

import javax.persistence.*;

/**
 * Created by Acer on 25/07/2017.
 */
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    private Album album;

    private Integer releaseYear;

    private  Integer rating;

    @OneToOne
    private Author author;


    public Song() {
    }

    public Song(String name, Integer releaseYear, Integer rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
