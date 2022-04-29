import java.io.*;
class Mkdir{

	public static void main(String[] args){
		String fileName = args[0];
		System.out.println("new file name :" +fileName);
		File f = new File(fileName);
		f.mkdir();
	
	}


}