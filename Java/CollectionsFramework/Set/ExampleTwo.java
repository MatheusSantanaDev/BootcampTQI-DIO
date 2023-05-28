package CollectionsFramework.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTwo {
    public static void main(String[] args) {
        
        System.out.println("--\tRandom order\t--");
        Set<Series> mySeries = new HashSet<>();
        mySeries.add(new Series("One Piece", "Shonen", 20));
        mySeries.add(new Series("Avatar: A lenda de Aang", "Adventure", 25));
        mySeries.add(new Series("Friends", "Sitcon", 22));
        mySeries.add(new Series("Adventure Time", "Adventure", 20));
        for(Series series: mySeries)
        System.out.println(series.getName() + ": '" + series.getGenre() + "' - " + series.getTimeEpisode() + "min");

        System.out.println("\n--\tEnter order\t--");
        Set<Series> mySeries1 = new LinkedHashSet<>();
        mySeries1.add(new Series("One Piece", "Shonen", 20));
        mySeries1.add(new Series("Avatar: A lenda de Aang", "Adventure", 25));
        mySeries1.add(new Series("Friends", "Sitcon", 22));
        mySeries1.add(new Series("Adventure Time", "Adventure", 20));
        for(Series series: mySeries1)
        System.out.println(series.getName() + ": '" + series.getGenre() + "' - " + series.getTimeEpisode() + "min");

        System.out.println("\n--\tNatural order (Time Episode)\t--");
        Set<Series> mySeries2 = new TreeSet<>(mySeries1);
        for(Series series: mySeries2)
        System.out.println(series.getName() + ": '" + series.getGenre() + "' - " + series.getTimeEpisode() + "min");

        System.out.println("\n--\tName/Genre/Time order\t--");
        Set<Series> mySeries3 = new TreeSet<>(new ComparatorNameGenreTime());
        mySeries3.addAll(mySeries);
        for(Series series: mySeries3)
        System.out.println(series.getName() + ": '" + series.getGenre() + "' - " + series.getTimeEpisode() + "min");

    }
}

class Series implements Comparable<Series> {
    private String name;
    private String genre;
    private Integer timeEpisode;

    public Series(String name, String genre, Integer timeEpisode){
        this.name = name;
        this.genre = genre;
        this.timeEpisode = timeEpisode;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public Integer getTimeEpisode(){
        return timeEpisode;
    }

    public String toString(){
        return "{" + "name='" + name + "'" + ", genre='" + genre +"', timeEpisodio=" + timeEpisode + "}";
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return name.equals(series.name) && genre.equals(series.genre) && timeEpisode.equals(series.timeEpisode);
    }

    public int hashCode() {
        return Objects.hash(name, genre, timeEpisode);
    }

    public int compareTo(Series series) {
        int timeEpisode = Integer.compare(this.getTimeEpisode(), series.getTimeEpisode());
        if(timeEpisode != 0)return timeEpisode;

        return this.getGenre().compareTo(series.getGenre());
    }
}

class ComparatorNameGenreTime implements Comparator<Series> {
        
    public int compare(Series s1, Series s2) {
        int name = s1.getName().compareTo(s2.getName());
        if(name != 0) return name;

        int genre = s1.getGenre().compareTo(s2.getGenre());
        if(genre != 0) return genre;
        
        return Integer.compare(s1.getTimeEpisode(), s2.getTimeEpisode());
    }
}