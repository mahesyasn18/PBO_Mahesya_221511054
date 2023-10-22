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
public class WeeklySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();
        Salesperson[] salesperson = new Salesperson[numSalespeople];
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter first name for salesperson " + (i + 1) + ": ");
            String firstName = scanner.next();

            System.out.println("Enter last name for salesperson " + (i + 1) + ": ");
            String lastName = scanner.next();

            System.out.println("Enter total sales for salesperson " + (i + 1) + ": ");
            int totalSales = scanner.nextInt();

            salesperson[i] = new Salesperson(firstName, lastName, totalSales);
        }
        Sorting.insertionSort(salesperson);
        System.out.println("Salespeople sorted by total sales and last name:");
        for (Salesperson salesperson1 : salesperson) {
            System.out.println(salesperson1.firstName + " " + salesperson1.lastName + " "+ salesperson1.totalSales);
        }
    }
}
