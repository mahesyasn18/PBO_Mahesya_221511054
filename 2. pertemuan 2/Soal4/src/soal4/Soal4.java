/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal4;

/**
 *
 * @author mahesya
 */
class Soal4 {

    /**
     * @param args the command line arguments
     */
    
    static short methodOne(long l){;
        int i = (int) l;
        return (short)i;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
    
}
