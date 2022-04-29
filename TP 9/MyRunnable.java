class MyRunnable implements Runnable {
 public void run() {
 for(int i=30;i>=0;i--){
	System.out.println("Il Reste " + i + "secondes pour l'execution de ce thread");
	try {
		Thread.sleep(1000);
	}
	catch(Exception e){}
	}
	}
}