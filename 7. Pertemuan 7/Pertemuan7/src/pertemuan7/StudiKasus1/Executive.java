/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus1;

/**
 *
 * @author mahesya
 */
public class Executive extends Employee{
    private double bonus;

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super( name, address, phone, socialSecurityNumber, payRate);
        this.bonus = 0;
    }
    
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus =0;
        return payment;
    }
     
}
