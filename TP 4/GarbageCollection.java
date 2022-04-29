public class GarbageCollection{
	public static void main(String[]args){
		Point p=new Point(5,4);
		p=null;
		System.gc();
		while(true);
	}
}
class Point{
	private int x;
	private int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public void finalize(){
		System.out.println("Bye Bye");
	}

}