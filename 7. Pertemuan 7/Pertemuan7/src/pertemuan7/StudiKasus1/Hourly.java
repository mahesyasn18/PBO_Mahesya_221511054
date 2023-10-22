/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus1;

/**
 *
 * @author mahesya
 */
public class Hourly extends Employee{
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super( name, address, phone,socialSecurityNumber, payRate);
        this.hoursWorked = 0;
    }
    
   public void addHours(int moreHours){
       hoursWorked += moreHours;
   }

    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result +="\nCureent hours: "+hoursWorked;
        return result;
    }
}
