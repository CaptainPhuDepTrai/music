package vn.edu.eiu.music.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 25/07/2017.
 */
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Artist artist;

    @Enumerated(EnumType.STRING)
    private AlbumType albumType;

    @OneToMany(mappedBy = "album")
    private List<Song> songs = new ArrayList<>();

    public Album(String name, AlbumType albumType) {
        this.name = name;
        this.albumType = albumType;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public AlbumType getAlbumType() {
        return albumType;
    }

    public void setAlbumType(AlbumType albumType) {
        this.albumType = albumType;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
