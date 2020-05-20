import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=1;
		// Do for each row
		for (int i = 1; i <=n; i++)
		{
			// Print '*' i times
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
			}
         k++;
			// Move to the next line
			System.out.print(System.lineSeparator());
		}
	}
}