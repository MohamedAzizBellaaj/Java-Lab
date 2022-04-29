class Garbage{
public void finalize(){
		System.out.println("Bye Bye");
	}
	public static void main(String[]args){
		Garbage i= new Garbage();
		i=null;
		System.gc();
	}
}
