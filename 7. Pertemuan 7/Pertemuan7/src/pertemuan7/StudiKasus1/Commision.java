/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus1;

/**
 *
 * @author mahesya
 */
public class Commision extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commision(String name, String address, String phone, String socialSecurityNumber,double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }
    
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay() {
        double hourlyPay = super.pay(); // Calculate hourly pay using the parent class method
        double commissionPay = totalSales * commissionRate; // Calculate commission pay
        double totalPay = hourlyPay + commissionPay;
        
        // Reset total sales to 0 (note: no need to reset hoursWorked)
        totalSales = 0.0;
        
        return totalPay;
    }
    
    @Override
    public String toString() {
        String parentToString = super.toString(); // Get the parent class's toString
        return parentToString + "\nTotal Sales: " + totalSales;
    }
}
