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
public class SoalNo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String angka = input.replaceAll(" ","");
        
        long gabunganCekPlat = (Long.parseLong(angka)-999999)%5;
        if (gabunganCekPlat != 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

    }
}
