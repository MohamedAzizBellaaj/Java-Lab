import java.io.*;
class Cat{

	public static void main(String[] args){
		File f = new File(args[0]);
		try{
		FileReader fr = new FileReader(f);
		int i=fr.read();
		while(i!=-1){ 
			System.out.print((char)i);
			i=fr.read();
		}
		}catch(Exception e){
		}
	}
}