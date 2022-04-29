import java.io.*;
class Pwd{

	public static void main(String[] args){
		File f = new File("");
		try{
		System.out.println(f.getAbsolutePath());
		}
		catch(Exception e){}
	}
}