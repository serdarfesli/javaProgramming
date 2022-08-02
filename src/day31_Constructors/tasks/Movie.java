package day31_Constructors.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String> castList;

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        castList = new ArrayList<>();
    }

    public void addCast(String str) {
        castList.add(str);

    }

    public void addCasts(String[] strArr){
        castList.addAll(Arrays.asList(strArr));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of Cast='"+ castList.size() +'\'' +
                '}';
    }
}
