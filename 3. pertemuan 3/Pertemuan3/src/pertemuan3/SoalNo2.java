/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author mahesya
 */
public class SoalNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata[] = new String[3];
        int angka[] = new int[3];
        for (int i = 0; i < 3; i++) {
            String input_kata = sc.next();
            kata[i] = input_kata;
            int input_angka = sc.nextInt();
            angka[i] = input_angka;
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s", kata[i]);
            System.out.printf("%03d%n", angka[i]);
        }
        System.out.println("================================");
    }
}
