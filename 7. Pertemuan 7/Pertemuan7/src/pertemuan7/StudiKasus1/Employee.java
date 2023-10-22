/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus1;

/**
 *
 * @author mahesya
 */
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
       String result = super.toString();
       result += "\nSocial Security Number: "+ socialSecurityNumber;
       
       return result;
    }

    @Override
    public double pay() {
       return payRate;
    }
   
}

