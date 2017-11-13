/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author moxdroid
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []a = {10, 1, 50, 30, 40};
        
        System.out.println(Arrays.toString(a));
        
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        //System.out.println(new Movie());
        
        String []str = {"Hello","a", "hello","b", "aa"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        Movie m1 = new Movie(1,"Thor");
        Movie m2 = new Movie(2,"Baby Boss");
        Movie m3 = new Movie(3,"Fight Club");
        Movie m4 = new Movie(4,"Tinker Bell");
        
        ArrayList<Movie> arrayListMovies = new ArrayList<>();
        arrayListMovies.add(m1);
        arrayListMovies.add(m2);
        arrayListMovies.add(m3);
        arrayListMovies.add(m4);
        
        System.out.println("Size : " + arrayListMovies.size());
        
        arrayListMovies.forEach((mm) -> {
            System.out.println(mm.toString());
        });
        
        
        arrayListMovies.add(2, new Movie(5,"Beautiful Mind"));
          arrayListMovies.add(new Movie(6,"Thor"));
        
        for(Movie mm: arrayListMovies)
        {
            System.out.println(mm.toString());
        }
         
        Movie m = arrayListMovies.get(1);
        System.out.println(m.toString());
        
        arrayListMovies.stream()
	.filter(s->s.toString().contains("Thor"))
	.forEach(System.out::println);
    }
    
}
