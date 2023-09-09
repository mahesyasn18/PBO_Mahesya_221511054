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
public class SoalNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        
        int GajiPokok = 500000;
        int bonusPenjualan =0;
        int denda = 0;
        int hargaPerItem = 50000;
        int totalGaji =0;
        
        if(item>=40 && item<=80){
            bonusPenjualan = item * 25 * hargaPerItem/100;
        }else if(item>80){
            bonusPenjualan = item * 35 * hargaPerItem/100;
        }else if(item <15){
            denda = ((15 - item) * hargaPerItem * 15/100);
        }else{
            bonusPenjualan = item * 10 *hargaPerItem/100;
        }
        
        totalGaji = GajiPokok + bonusPenjualan - denda;
        System.out.println( + totalGaji);
    }
}
