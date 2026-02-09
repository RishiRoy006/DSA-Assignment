/*Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements*/
import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the length of first array : ");
		int n=in.nextInt();
		double arr[][]=new double[n][n];
		System.out.print("Enter the elements of first array : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=in.nextInt();
				
			}
		}
		System.out.print("Enter the length of second array : ");
		int n1=in.nextInt();
		double brr[][]=new double[n1][n1];
		System.out.print("Enter the elements of second array : ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				brr[i][j]=in.nextInt();
			}
		}
		if(n==n1)
		{
			System.out.println("Sum of both the matrices are:");
		double[][] ans = addMatrix(arr,brr);
		for (int i = 0; i < ans.length; i++) {
	        for (int j = 0; j < ans.length; j++) {
	            System.out.print(ans[i][j]+" ");
	        }
	    }
		}else
			System.out.println("Both the arrays are havng different lengths!!");
	}
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double s[][]=new double[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				s[i][j]=a[i][j]+b[i][j];
			}
		}
		return s;
	}
}
