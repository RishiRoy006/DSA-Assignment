/*Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6*/
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=in.nextInt();
		int k=num;
		if(sum_Of_Digits(num)>9)
		{
			sum_Of_Digits(sum_Of_Digits(num));
		}
		System.out.print("Sum of digits of "+k+" until the number is a single digit is "+sum_Of_Digits(num));
	}
	public static int sum_Of_Digits(int n)
	{
		int s=0;
		while(n>0)
		{
			int d=n%10;
			s+=d;
			n=n/10;
		}
		return s;
	}
}
