/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.studiKasus3;

import java.util.Scanner;

/**
 *
 * @author mahesya
 */
public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many strings do you want to sort? ");
        size = scanner.nextInt();
        strList = new String[size];
        
        System.out.println("\nEnter the strings....");
        for (int i = 0; i < size; i++) {
            strList[i] = scanner.next();
        }
        Sorting.insertionSort(strList);
        
        System.out.println("\nYour strings in sorted order....");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }
        System.out.println();
    }
}

