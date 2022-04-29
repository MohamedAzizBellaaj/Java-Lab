import java.io.*;
class Permissions {
	public static void main (String [] args) {
		File f = new File(args[0]);
		if(f.canRead()){
			System.out.print("r");
		}
		if(f.canWrite()){
			System.out.print("w");
		}
		if(f.canExecute()){
		System.out.print("x");
		}
	}
 
}