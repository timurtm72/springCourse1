package ru.maxima.spring.player;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private  Music music;
    private static List<Music> genresOfMusic = new ArrayList<Music>();
    public MusicPlayer(Music music) {
        this.music = music;
        addGenre(music);
     }
    public  Music getGenre(int index) {
        if (!genresOfMusic.isEmpty()) {
            return genresOfMusic.get(index);
        }
        return null;
    }
    public static void addGenre(Music music) {
        if ( music != null) {
            genresOfMusic.add(music);
        }
    }

    public void play() {
        System.out.println("Now playing " + this.music.getSong());
    }
    public static void allGenresPlay(){
        for (int i = 0; i < genresOfMusic.size(); i++) {
            MusicPlayer mp = new MusicPlayer(genresOfMusic.get(i));
            mp.play();
        }

    }

}
