import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int r,rev=0;
    while(n1!=0)
    {
      r=n1%10;
      rev=(rev*10)+r;
      n1=n1/10;
    }
    System.out.println(rev);
  }
}