import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    private String name; 
    private double rating; 
    private int year;    

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getN() { 
      return name; 
    } 
    public double getR() { 
      return rating; 
    } 
    public int getY() { 
      return year; 
    }    
}

class Rating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
      
        return Double.compare(m2.getR(), m1.getR());
    }
}


class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
      
        return m1.getN().compareTo(m2.getN()); 
    }
}

public class Geeks {
    public static void main(String[] args) {
      
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.7, 1977));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));

        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie m1 : m) {
            System.out.println(m1.getR() + " " + m1.getN() + " " + m1.getY());
        }

        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movie m1 : m) {
            System.out.println(m1.getN() + " " + m1.getR() + " " + m1.getY());
        }
    }
}
