package com.claudiobailon.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    public Album album;

    String title;
    int length;
    int trackNumber;

    public Song(Album album, String title, int length, int trackNumber) {
        this.album = album;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song(){};

    public String getTitle() { return title; }

    public int getLength() {return length; }

    public int getTrackNumber() {return trackNumber; }

    public Album getAlbum() {return album; }
}
