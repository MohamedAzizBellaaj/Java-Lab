public class TestThreads {
 public static void main (String [] args) {
 MyRunnable r = new MyRunnable();
 Thread foo = new Thread2("1",30);
 Thread bar = new Thread2("2",20);
 Thread bat = new Thread2("3",10);
 foo.start();
 bar.start();
 bat.start();
 }
}