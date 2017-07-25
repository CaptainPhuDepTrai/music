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

    @ManyToOne
    private Artist artist;

    @Enumerated(EnumType.STRING)

    @ManyToOne
    private AlbumType albumType;

    //fetch: kéo hết , EAGER lấy hết
    //cascade là thác nước, chi cho sự lan truyền
    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList<>();

    public Album(String name, AlbumType albumType) {
        this.name = name;
        this.albumType = albumType;
    }


    public Album addSong(Song song){
        songs.add(song);
        song.setAlbum(this);

        return this;
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
