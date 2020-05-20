import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc;
      int number, count=0,i;
		sc = new Scanner(System.in);
	    number=sc.nextInt();
      for(i=1;i<=100;i=i+2)
      {
        count++;
        if(count==number+1)
        {
          break;
        }
        System.out.println(i);
      }
        
	
	}
}