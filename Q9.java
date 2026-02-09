/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.
Sample Run:
Enter a 4-by-4 matrix row by row:
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5
*/
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);

System.out.print("Enter the size of the array:");
int n=in.nextInt();
double arr[][]=new double[n][n];
System.out.println("Enter a "+n+" -by- "+n+" matrix row by row: ");
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		arr[i][j]=in.nextDouble();
		System.out.print(" ");
	}
	System.out.println();
}
System.out.print("Sum of the elements in the major diagonal is : "+sumMajorDiagonal(arr)); 
	}
	public static double sumMajorDiagonal(double[][] m)
	{
		double s=0.0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				if(i==j)
				{
					s+=m[i][j];
				}
			}
		}
		return s;
	}
}
