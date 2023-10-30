package org.example.entity;

import javax.persistence.*;

@Entity //<<--- this annotation will tell hibernate this is the special class no longer java bean.
@Table
        (name = "Song")
public class Song {
    // songId, songName, singer
    @Id
    @Column(name = "songId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String songName;
    @Column(name="singer")
    private String artist;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
