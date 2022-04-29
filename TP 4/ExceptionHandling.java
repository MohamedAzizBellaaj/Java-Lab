import java.util.Scanner;

public class ExceptionHandling{
	public static void main(String [] args){
		int[] tab ={1,2,3,4};
		Scanner scan= new Scanner(System.in);
		try{
		int x=scan.nextInt();
		System.out.println("La valeur d'indexe "+x+" = "+tab[x]);
		}
		catch(Exception e){
			System.out.println("Erreur commise " + e.toString());
		}
		
	}   

}