/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ets;

import com.google.gson.Gson;
import java.io.FileReader;

/**
 *
 * @author mahesya
 */
public class ETS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            
            //membaca file data.json
            String JSON_FILE = "data.json";
            Delivery[] deliveries = gson.fromJson(new FileReader(JSON_FILE), Delivery[].class);

            // Header Table
            System.out.printf("%-21s | %-8s | %-7s | %-15s | %-25s | %-15s | %-10s%n",
                    "productName", "Quantity", "Weight", "Destination", "servicePackage", "ServiceValue", "Total");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            // Iterasi setiap elemen dalam array deliveries
            for (Delivery delivery : deliveries) {
                // Proses Perhitungan total yang harus dibayar (quantity * price per item + shipping cost)
                double pricePerItem = delivery.getPriceItem();
                int quantity = delivery.getQuantity();
                double shippingCost = delivery.getServicePackage().getValue();
                double totalCost = (quantity * pricePerItem) + shippingCost;

                // Print daftar delivery dalam format table
                System.out.printf("%-21s | %-8s | %-7s | %-15s | %-25s | %-15s | %-10.2f%n",
                        delivery.getProductName(), delivery.getQuantity(), delivery.getWeight(),
                        delivery.getCity().getDestination(), delivery.getServicePackage().getService(),
                        delivery.getServicePackage().getValue(), totalCost);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
