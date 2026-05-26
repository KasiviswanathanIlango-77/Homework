/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentsproject;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
     public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String user = "postgres";
        String password = "Anbukasi@97";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
