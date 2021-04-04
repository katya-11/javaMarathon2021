package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bandMember;

    public List<MusicArtist> getBandMember() {
        return bandMember;
    }

    public void setBandMember(List<MusicArtist> bandMember) {
        this.bandMember = bandMember;
    }

    public String getName() {
        return name;

    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year, List<MusicArtist> bandMember) {
        this.name = name;
        this.year = year;
        this.bandMember = bandMember;
    }

    @Override
    public String toString() {
        return "название группы= " + name +
                ", год основания= " + year;
    }

    public static void transferMembers(MusicBand musicband1, MusicBand musicband2) {
        for (MusicArtist member : musicband1.getBandMember()) {
            musicband2.getBandMember().add(member);
        }
        musicband1.getMembers().clear();
    }


    public void printMembers() {
        System.out.println(this.bandMember);
    }

    public List<MusicArtist> getMembers() {
        return this.bandMember;
    }
}
