/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author mahesya
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
    
}
