import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(k);
        }
        k++;
        System.out.print(System.lineSeparator());
	}
}
}