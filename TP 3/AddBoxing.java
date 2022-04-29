class AddBoxing {
 void doX(Float x, Float y) { System.out.println("Float, Float"); }
 void doX(long... x) { System.out.println("long... "); }
 void doX(Integer x, Integer y) { System.out.println("Integer, Integer"); }
 void doX(Byte n, Byte m) { System.out.println("Byte, Byte"); }
 void doX(Double x, Double y){System.out.println("Double, Double");}
 public static void main(String[] args) {
 new AddBoxing().go();
 }
 void go() {
 short s = 7;
 doX(s,s);
} }