/* 
 * author : Nothinghere
 */

import java.util.Scanner;
public class A_Jam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours, minutes, seconds;

        System.out.print(" The Hour: ");
        hours = sc.nextInt();
        minutes = (hours * 3600)/60 ;
        seconds = hours * 3600 ; 

        System.out.println("\nConversion results " + hours + " hours is" );
        System.out.println( "Minutes: " + minutes + " minute" );
        System.out.println("Seconds: " + seconds + " second");
        
    }
}
