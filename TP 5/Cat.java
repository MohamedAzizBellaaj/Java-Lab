import java.io.*;
class Cat{

	public static void main(String[] args){
		String fileName = args[0];
		File f = new File(fileName);
		try{
		f.createNewFile();
		}
		catch(Exception e){}
	}
}