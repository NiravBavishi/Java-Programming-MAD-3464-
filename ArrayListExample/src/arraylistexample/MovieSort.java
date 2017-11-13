
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.Comparator;

/**
 *
 * @author moxdroid
 */
public class MovieSort{

    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieRating=" + ratings + '}';
    }

    public MovieSort() {
    }

    public MovieSort(int movieId, String movieTitle, float ratings) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.ratings = ratings;
    }
    
    int movieId;
    String movieTitle;
    float ratings;

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
 
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
   
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    
    /*Comparator for sorting the list by Movies Title*/
    public static Comparator<MovieSort> movieTitleComparator = new Comparator<MovieSort>() {

	public int compare(MovieSort m1, MovieSort m2) {
	   String movieTitle1 = m1.getMovieTitle().toUpperCase();
	   String movieTitle2 = m2.getMovieTitle().toUpperCase();

	   //ascending order
	   return movieTitle1.compareTo(movieTitle2);

	   //descending order
	   //return movieTitle2.compareTo(movieTitle1);
    }};
    
     /*Comparator for sorting the list by Movies Ratings*/
    public static Comparator<MovieSort> movieRatingsComparator = new Comparator<MovieSort>() {

	public int compare(MovieSort m1, MovieSort m2) {
	   
	   //ascending order
           /*
	   if(m1.getRatings() == m2.getRatings())
               return 0;
           else if(m1.getRatings() > m2.getRatings())
               return 1;
           else return -1;
*/

	   //descending order
           Float rating1 = m1.getRatings();
           Float rating2 = m2.getRatings();
           
	   return rating2.compareTo(rating1);
    }};
    
    
     /*Comparator for sorting the list by Movies Ratings*/
    public static Comparator<MovieSort> movieIDComparator = new Comparator<MovieSort>() {

	public int compare(MovieSort m1, MovieSort m2) {
	   return m1.getMovieId() - m2.getMovieId();
        
    }};
}
