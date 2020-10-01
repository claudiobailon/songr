package com.claudiobailon.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    public Album album;

    public String title;
    public int length;
    public int trackNumber;

    public Song(Album album, String title, int length, int trackNumber) {
        this.album = album;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song(){};
}
