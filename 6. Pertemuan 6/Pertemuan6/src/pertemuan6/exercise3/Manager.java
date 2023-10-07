/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6.exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mahesya
 */
public class Manager extends Employee{
       
    public Manager(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
        secretaryName = "";
    }
    
    public void raiseSalary(double byPercent){ 

        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName(){ 
        return secretaryName;
    }
    
    private String secretaryName;
       
}
