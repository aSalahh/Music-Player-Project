package com.example.musicapp;

public class Song {

    private String songName;
    private String songerName;

    public Song(String songName, String songerName) {
        this.songName = songName;
        this.songerName = songerName;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongerName() {
        return songerName;
    }
}
