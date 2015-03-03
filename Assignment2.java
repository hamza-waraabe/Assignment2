
import java.util.Scanner;
/**
 * Name : Hamza Abshir
 * Date : 1/3/2015
 * @author haa2224
 * Assignment2 
 */
public class Assignment2 {
        public static void main(String[] args) {
              
        	
        	   // Declaring variables
        	    String number1, number2, number3, number4,number5, max;
                int med, middle;
                Double n1, n2, n3, n4, n5, sum, avr, max1 , min, med1, med2;
                int int1, int2, int3, int4, int5;
 
                //promt user to input numbers
                System.out.println("Hi please input five numbers to proceed "); 
                Scanner keyboard = new Scanner(System.in);
               
                //inputs
                number1 = keyboard.next();
                number2 = keyboard.next();
                number3 = keyboard.next();
                number4 = keyboard.next();
                number5 = keyboard.next();
                
                n1 = Double.parseDouble(number1);
             
                //change from double to int
                int1 = n1.intValue(); 
                n2 = Double.parseDouble(number2);
                int2 = n2.intValue();
                n3 = Double.parseDouble(number3);
                int3 = n3.intValue();
                n4 = Double.parseDouble(number4);
                int4 = n4.intValue();
                n5 = Double.parseDouble(number5);
                int5 = n5.intValue(); //
              
                //the sum
               sum = n1+n2+n3+n4+n5; 
               //display sum
               System.out.println("The sum of the five numbers is " + sum); 
            
                // the average
                avr = (n1+n2+n3+n4+n5)/5; 
               // display avarage
                System.out.println("The average of the five number is " + avr); 
             
                 // the max
                max1 = Math.max(Math.max(n1, Math.max(n2, n3)), Math.max(n4, n5)); 
               //display  max
                System.out.println("The maximum of the five number is " + max1);
             
                //the min
                min = Math.min(Math.min(n1, Math.min(n2, n3)), Math.min(n4, n5)); 
               //Display  min
                System.out.println("The minimum of the five number is " + min); 

                int set[] = {int1, int2, int3, int4, int5};
               // the median
                middle = set.length/2;
                med = set[middle + 0];//find  median
              
    	
    //didplay  median
      System.out.println("The median of the five numbers is " + med ) ; {
}}
}