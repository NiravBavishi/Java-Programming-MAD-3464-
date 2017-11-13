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
public class MovieSortExample {
    public static void main(String... args)
    {
        
        //sortStringArrayList();
                
        Movie m1 = new Movie(100,"Thor");
        Movie m2 = new Movie(20,"Baby Boss");
        Movie m3 = new Movie(3,"Fight Club");
        Movie m4 = new Movie(42,"Tinker Bell");
        
        ArrayList<Movie> arrayListMovies = new ArrayList<>();
        arrayListMovies.add(m1);
        arrayListMovies.add(m2);
        arrayListMovies.add(m3);
        arrayListMovies.add(m4);
        arrayListMovies.add(2, new Movie(95,"Beautiful Mind"));
        arrayListMovies.add(new Movie(61,"Thor"));
        
        //Display size of movies arraylist
        System.out.println("Size : " + arrayListMovies.size());
        //Display Movies details using loop
        System.out.println("Unsorted Movie Objects");
        for(Movie mm: arrayListMovies)
        {
            System.out.println(mm.toString());
        }
        
        //Sort ArrayList of Movies
        Collections.sort(arrayListMovies);
        
          System.out.println("Sorted Movie Objects");
        for(Movie mm: arrayListMovies)
        {
            System.out.println(mm.toString());
        }
    }
    
    private static void sortStringArrayList()
    {
        ArrayList<String> arrayListStrings = new ArrayList<>();
        arrayListStrings.add("Pritesh");
        arrayListStrings.add("Patel");
        arrayListStrings.add("Abhi");
        arrayListStrings.add("Arman");
        arrayListStrings.add("Zika");
        arrayListStrings.add("Josh");
        arrayListStrings.add("Bravin");
        arrayListStrings.add("Joy");
        arrayListStrings.add("Kumar");
        arrayListStrings.add("Mathwe");
        arrayListStrings.add("Ta");
        
        System.out.println("Unsorted Array List");
        for(String mm: arrayListStrings)
        {
            System.out.println(mm);
        }
        
        //Sort Strings using Collections sort method
        Collections.sort(arrayListStrings);
        
        System.out.println("Sorted Array List");
        for(String mm: arrayListStrings)
        {
            System.out.println(mm);
        }
    }
}
