package com.sdet.checkpoint;

public class MyMovies {

    public static void main(String[]args) {

        Movie myMovie = new Movie("I am a movie title", "Ghost Studios", "G");
        System.out.println(myMovie);

        myMovie.setRating("R");
        myMovie.setStudio("V4");
        myMovie.setTitle("QA2SDET");

        String title = myMovie.getTitle();
        String studio = myMovie.getStudio();
        String rating = myMovie.getRating();
        System.out.println("Title: " + title + "\n" + "Studio: " + studio + "\n" + "Rating: " + rating);
    }
}
