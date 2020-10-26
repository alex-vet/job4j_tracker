package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String lyrics;
        switch (position) {
            case 1:
                lyrics = "Пусть бегут неуклюже";
                break;
            case 2:
                lyrics = "Спокойной ночи";
                 break;
            default:
                lyrics = "Песня не найдена";
                break;
        }
        System.out.println(lyrics);
    }

    public static void main(String[] args) {
        Jukebox jb = new Jukebox();
        jb.music(1);
        jb.music(2);
        jb.music(3);
    }
}
