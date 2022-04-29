public class GarbageIsland{
	GarbageIsland n;
	public static void main(String [] args){
		GarbageIsland i2 = new GarbageIsland();
		GarbageIsland i3 = new GarbageIsland();
		GarbageIsland i4 = new GarbageIsland();
		i2.n = i3;
		i3.n = i4;
		i2 = null;
		i3 = null;
		i4 = null;
		System.gc();
		while(true);
	}   
	public void finalize(){
		System.out.println("Bye Bye");
	}

}