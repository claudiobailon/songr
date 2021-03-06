package com.claudiobailon.songr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    int songCount;
    int length;
    String imageURL;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    public List<Song> songs = new ArrayList<Song>();

    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    public Album(){}//default constructor

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getImageURL() {
        return imageURL;
    }
    public void setImageUrl(String imageURL) {
        this.imageURL = imageURL;
    }

    public long getId(){return id;}
    public List<Song> getSongs(){ return songs;}
}
