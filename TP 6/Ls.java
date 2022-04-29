import java.io.File;  
import java.util.Scanner;  
public class Ls {  
    public static void main(String args[]) {     
		File f = new File("C:\\Users\\DELL\\Desktop\\Java Projects\\TP\\TP 5");
		for (int i=0; i < f.list().length;i++){
		
		System.out.println(f.list()[i]);
		}


		
	}
}