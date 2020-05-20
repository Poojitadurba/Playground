import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int sum=(n1/100)+(n1%10);
      System.out.println(sum);
	}
}