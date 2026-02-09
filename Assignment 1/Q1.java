/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
Sample Run:
The positive integer greater than 2 from command line argument
is 67.
The number of times one must repeatedly divide this number by 2
before getting a value less than 2 is 5. */
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
System.out.println("The positive integer greater than 2 from command line argument is "+n);
int ctr=1;
while(n>2)
{
	n=n/2;
	ctr++;
}
System.out.print("The number of times one must repeatedly divide this number by 2 \r\n" + 
		"before getting a value less than 2 is "+ctr);
	}

}
