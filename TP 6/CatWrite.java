import java.io.*;
import java.util.Scanner;
public class CatWrite{

	 public static void main(String[] args){
		try{
			FileOutputStream os=new FileOutputStream(args[0]);
			Scanner sc = new Scanner(System.in);
			String input="";
			int length=1;
	        while (length!=0) {
	            System.out.print(">		");
				input=sc.nextLine();
				length=input.length();
				input+="\n";
				os.write(input.getBytes());
	        }
		}catch(IOException e){}
	}
}
