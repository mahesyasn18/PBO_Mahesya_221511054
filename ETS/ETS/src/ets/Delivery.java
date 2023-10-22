/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

/**
 *
 * @author mahesya
 */
public class Delivery {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public String getProductName() {
        return productName;
    }

    public City getCity() {
        return city;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public Status getStatus() {
        return status;
    }

    public int getQuantity() {
        return quantity;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public int getWeight() {
        return weight;
    } 
}
