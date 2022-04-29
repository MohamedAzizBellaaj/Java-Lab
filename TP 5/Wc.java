import java.io.*;
class Wc{

	public static void main(String[] args){
		String fileName = args[0];
		File f = new File(fileName);
		System.out.println("La taille est "+ f.length());
	}


}