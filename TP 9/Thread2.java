public class Thread2 extends Thread{
	String name;
	int life;
	public Thread2(String name,int life){
		this.name = name;
		this.life = life;
	}
	public void run() {
 for(int i=life;i>=0;i--){
	System.out.println("Il reste " + i + "secondes pour l'execution de thread " + name);
	try {
		Thread.sleep(1000);
	}
	catch(Exception e){}
	}
	}
}