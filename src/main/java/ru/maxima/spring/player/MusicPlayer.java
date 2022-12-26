package ru.maxima.spring.player;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private static Music music;
    private static List<Music> genresOfMusic = new ArrayList<Music>();
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public static Music getGenre(int index) {
        if (!genresOfMusic.isEmpty()) {
            return genresOfMusic.get(index);
        }
        return null;
    }
    public static void addGenre(Music genre) {
        if (genre != null) {
            genresOfMusic.add(genre);
        }
    }

    public void play() {
        System.out.println("Now playing " + music.getSong());
    }
    public static void allGenresPlay(){
        for (int i = 0; i < genresOfMusic.size(); i++) {
            MusicPlayer mp = new MusicPlayer(genresOfMusic.get(i));
            mp.play();
        }

    }

}
