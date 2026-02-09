/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
and finds the first row and column with the most 1s.
Sample run:
0 0 1 1
0 0 1 1
1 1 0 1
1 0 1 0
The largest row index: 2
The largest column index: 2
*/
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[][]=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print((int)(Math.random()*2)+" ");
			}
			System.out.println();
		}
		int s_row=0,s_column=0;
		int j=0;
		for(int i=0;i<4;i++)
		{
			s_column+=arr[i][j];
		}
		
  }
	}

