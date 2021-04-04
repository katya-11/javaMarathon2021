package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public String getName() {
        return name;

    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + "название группы= " + name +
                ", год основания= " + year + "]";
    }
}
