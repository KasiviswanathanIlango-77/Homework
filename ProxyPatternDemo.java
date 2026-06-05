/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

/**
 *
 * @author HP
 */
public class ProxyPatternDemo {
     public static void main(String[] args) {

        Movie user1 = new MovieProxy("Leo", 20);
        user1.play();

        Movie user2 = new MovieProxy("Leo", 16);
        user2.play();
    }
}

