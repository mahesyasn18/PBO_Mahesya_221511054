import java.io.*;


/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the Screen.
 * <p>
 * <b>Note:</b> Giving proper Comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * @author mahesya
 * @version 1.0
 * @since 2023
 */
public class AddNum {
    /**
     * this method is use to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags
     * @param numA this is the first parameter to addNum method
     * @param numB this is the second parameter to addNum method
     * @return int this returns sum of numA and numB
    **/

     public int addNum(int numA, int numB){
        return numA+numB;
    }
    
   
    /**
     * this is the main method which makes use of addNum method. 
     * @param args Unused
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10,20);
        System.out.println("Sum of 10 and 20 is : "+ sum);
    }
    
}
