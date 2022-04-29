import java.util.Scanner;

public class Assertions{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		assert(age>0);
		System.out.println("Mon age est "+ age);
	}
}