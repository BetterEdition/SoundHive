/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundhive;

/**
 *
 * @author EdwinSilva
 */
public class SongFile {
    private String name;
    private String artist;
    private String genre;
    private int duration;
    
    public SongFile(String name, String artist, String genre, int duration){
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
    
}
