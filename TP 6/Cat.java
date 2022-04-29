import java.io.*;
public class Cat{

	public static void main(String[] args){
		byte [] b;
		File f = new File(args[0]);
		try{
		FileInputStream fin = new FileInputStream(f);
		int size = (int) f.length();
		b = new byte[size];
		fin.read(b);
		String s = new String(b);
		System.out.println(s);
		}catch(Exception e){
		}
	}
}