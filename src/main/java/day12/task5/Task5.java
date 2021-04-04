package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Vova", 90));
        members1.add(new MusicArtist("Gena", 75));
        members1.add(new MusicArtist("Olga", 101));

        MusicBand musicBand1 = new MusicBand("Band1", 1900, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Jane", 91));
        members2.add(new MusicArtist("Franco", 45));
        members2.add(new MusicArtist("Keo", 99));

        MusicBand musicBand2 = new MusicBand("Band2", 1987, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand2, musicBand1);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
