/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.
Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.
*/
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		int max=0,min=9999,ctr1=0,ctr2=0,min_pos=0;
		System.out.print("Enter elements of the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==max)
			{
				ctr1++;
			}
			else if(arr[i]==min)
			{
				ctr2++;
				min_pos=i+1;
			}
		}
		
		System.out.println("Maximum element of Array is "+max+" and occurs "+ctr1+" times.");
		System.out.println("Minimum element of Array is "+min+" and occurs "+ctr2+" times.");
		for(int i=0;i<n;i++)
		{
			if(arr[i]==max)
			{
				System.out.println("First occurrence of maximum element is at position " +(i+1));
				break;
			}
		}
		
        System.out.println("Last occurrence of minimum element is at position " + min_pos);
	}

}
