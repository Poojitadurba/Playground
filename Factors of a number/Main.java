import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc;
      int Number, i;
		sc = new Scanner(System.in);
		
		//System.out.println("Please Enter any number to Find Factors: ");
		Number = sc.nextInt();
	for(i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.println(i);
			}
		}
	}
}