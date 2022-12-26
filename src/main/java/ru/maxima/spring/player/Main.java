package ru.maxima.spring.player;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = context.getBean("ClassicalMusicBean", Music.class);
        Music rockMusic = context.getBean("RockMusicBean", Music.class);
        Music popMusic = context.getBean("PopMusicBean", Music.class);

        MusicPlayer classicalMusicPlayerBean = context.getBean("classicalMusicPlayerBean",MusicPlayer.class);
        MusicPlayer rockMusicPlayerBean = context.getBean("rockMusicPlayerBean",MusicPlayer.class);
        MusicPlayer popMusicPlayerBean = context.getBean("popMusicPlayerBean",MusicPlayer.class);

        classicalMusicPlayerBean.play();
        rockMusicPlayerBean.play();
        popMusicPlayerBean.play();

//        MusicPlayer.addGenre(classicalMusic);
//        MusicPlayer.addGenre(rockMusic);
//        MusicPlayer.addGenre(popMusic);

//        MusicPlayer.allGenresPlay();

        context.close();
    }
}
