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
public class SoalNo3 {
    
    public static void main(String[] args) {
        int hasil=0;
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split(" "); 
       
        int operand1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int operand2 = Integer.parseInt(parts[2]);
        if (operand1>=1 && operand2<=1000) {
            switch (operator) {
                case "+":
                    hasil = operand1 + operand2;
                    break;
                case "-":
                    hasil = operand1 - operand2;
                    break;
                case "*":
                    hasil = operand1 * operand2;
                    break;
                case "/":
                    hasil = operand1 / operand2;
                    break;
                default:
                    System.out.println("Operator Salah. Masukkan '+', '-', '*', or '/'.");
                    return;
            }  
        } else {
            System.out.println("Input salah, Angka harus diantara 1-1000");
        }
        
        
        System.out.println(hasil);
        
    }
    
}
