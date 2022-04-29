class Test{
public static void main(String [] args){
StringBuffer sb = new StringBuffer("abc");
sb.append("def");
System.out.println("sb = " + sb); // output is "sb =abcdef"

StringBuilder sb2 = new StringBuilder("abc");
sb2.append("def").reverse().insert(3, "---");
System.out.println( sb2 ); // output is "fed ---cba"
}
}