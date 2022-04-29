import java.io.*;
class Rename{

	public static void main(String[] args){
		String fileName = args[0];
		File f = new File(fileName);
		f.renameTo(new File(args[1]));
	}


}