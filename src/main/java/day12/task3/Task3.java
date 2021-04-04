package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandsList = new ArrayList<>();
        musicBandsList.add(new MusicBand("MusicBand1", 2000));
        musicBandsList.add(new MusicBand("MusicBand2", 2001));
        musicBandsList.add(new MusicBand("MusicBand3", 2000));
        musicBandsList.add(new MusicBand("MusicBand4", 2003));
        musicBandsList.add(new MusicBand("MusicBand5", 1999));
        musicBandsList.add(new MusicBand("MusicBand6", 2020));
        musicBandsList.add(new MusicBand("MusicBand7", 1990));
        musicBandsList.add(new MusicBand("MusicBand8", 2019));
        musicBandsList.add(new MusicBand("MusicBand9", 2001));
        musicBandsList.add(new MusicBand("MusicBand10", 2000));

        //перемешали список
        Collections.shuffle(musicBandsList);

        //оригинальный список
        System.out.println(musicBandsList);

        //вывести группы после 2000 года
        System.out.println(groupsAfter2000(musicBandsList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> copyBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                copyBands.add(band);
            }
        }
        return copyBands;
    }
}
