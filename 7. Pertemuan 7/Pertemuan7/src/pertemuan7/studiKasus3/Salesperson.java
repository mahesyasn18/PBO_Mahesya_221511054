/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.studiKasus3;

/**
 *
 * @author mahesya
 */
public class Salesperson implements Comparable<Salesperson>{
    protected String firstName;
    protected String lastName;
    protected int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    
    @Override
    public int compareTo(Salesperson other) {
       int salesComparison = Integer.compare(this.totalSales, other.totalSales);
        if (salesComparison == 0) {
            return this.lastName.compareTo(other.lastName);
        }
        return salesComparison;
    }  
}
