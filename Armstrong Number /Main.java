import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int num, number, temp, total = 0;
        //System.out.println("Enter 3 Digit Number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}