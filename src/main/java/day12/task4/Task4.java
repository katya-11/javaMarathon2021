package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> member1 = new ArrayList<>();
        member1.add("Jane Air");
        member1.add("Black White");
        MusicBand musicBand1 = new MusicBand("Band1", 1920, member1);

        List<String> member2 = new ArrayList<>();
        member2.add("Ola Lui");
        member2.add("Markus Raso");
        member2.add("Vlad Fiat");
        MusicBand musicBand2 = new MusicBand("Band2", 2021, member2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }

}
