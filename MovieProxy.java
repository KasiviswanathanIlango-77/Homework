/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

/**
 *
 * @author HP
 */
class MovieProxy implements Movie {

    private RealMovie realMovie;
    private String movieName;
    private int age;

    public MovieProxy(String movieName, int age) {
        this.movieName = movieName;
        this.age = age;
    }

    public void play() {

        if (age >= 18) {
            realMovie = new RealMovie(movieName);
            System.out.println("Age Verified");
            realMovie.play();
        } else {
            System.out.println("Access Denied");
        }
    }
}
