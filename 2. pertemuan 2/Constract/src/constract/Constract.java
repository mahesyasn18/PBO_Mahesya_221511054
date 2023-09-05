/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constract;

/**
 *
 * @author mahesya
 */
public class Constract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        
        System.out.println("Paper size in centimeter: "+ paperWidth * CM_PER_INCH+ " by "+ paperHeight * CM_PER_INCH);
    }
    
}
