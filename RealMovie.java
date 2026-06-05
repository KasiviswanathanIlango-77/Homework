/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;


public class RealMovie implements Movie {
    private String movieName;

    public RealMovie(String movieName) {
        this.movieName = movieName;
    }

    public void play() {
        System.out.println("Movie Playing...");
    }
}
