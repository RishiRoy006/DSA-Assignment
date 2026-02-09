/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”*/
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();


        if ((a+b==c)||(a == b-c)||(a*b == c)){
            System.out.println("They can be used in a correct arithmetic formula ");
        } 
        else
        	System.out.println("They cannot be used in a correct arithmetic formula ");
        
    }

}
