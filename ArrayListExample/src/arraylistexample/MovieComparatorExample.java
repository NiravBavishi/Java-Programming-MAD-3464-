/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author moxdroid
 */
public class MovieComparatorExample {
    public static void main(String... args)
    {
    MovieSort m1 = new MovieSort(100,"Thor",5);
        MovieSort m2 = new MovieSort(20,"Baby Boss", 3.5f);
        MovieSort m3 = new MovieSort(3,"Fight Club", 2.0f);
        MovieSort m4 = new MovieSort(42,"Tinker Bell",3.3f);
        
        ArrayList<MovieSort> arrayListMovieSorts = new ArrayList<>();
        arrayListMovieSorts.add(m1);
        arrayListMovieSorts.add(m2);
        arrayListMovieSorts.add(m3);
        arrayListMovieSorts.add(m4);
        arrayListMovieSorts.add(2, new MovieSort(95,"Beautiful Mind", 4.2f));
        arrayListMovieSorts.add(new MovieSort(61,"Thor", 1.5f));
        
        //Display size of movies arraylist
        System.out.println("Size : " + arrayListMovieSorts.size());
        //Display MovieSorts details using loop
        System.out.println("Unsorted MovieSort Objects");
        for(MovieSort mm: arrayListMovieSorts)
        {
            System.out.println(mm.toString());
        }
        
        //Sort ArrayList of Movies by title
        Collections.sort(arrayListMovieSorts, MovieSort.movieTitleComparator);
        
        System.out.println("Sorted MovieSort Objects by Title");
        for(MovieSort mm: arrayListMovieSorts)
        {
            System.out.println(mm.toString());
        }
        
        //Sort ArrayList of Movies by Rating
        Collections.sort(arrayListMovieSorts, MovieSort.movieRatingsComparator);
        
        System.out.println("Sorted MovieSort Objects by Rating");
        for(MovieSort mm: arrayListMovieSorts)
        {
            System.out.println(mm.toString());
        }
        
         //Sort ArrayList of Movies by Movie ID
        Collections.sort(arrayListMovieSorts, MovieSort.movieIDComparator);
        
        System.out.println("Sorted MovieSort Objects by Movie ID");
        for(MovieSort mm: arrayListMovieSorts)
        {
            System.out.println(mm.toString());
        }
    }
}
