/*Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1.*/
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.print("Enter the numbers in the first array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.print("Enter the numbers in the second array: ");
		for(int i=0;i<n;i++)
		{
			b[i]=in.nextInt();
		}
		System.out.print("The dot product of both the arrays are: ");
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]*b[i];
			System.out.print(c[i]+" ");
		}
	}

}
