class AnotherAutoboxing{
public static void main(String [] args){
Double i1 = 126.0;
Double i2 = 126.0;
if(i1 != i2) 
System.out.println("different objects"); 
if(i1.equals(i2)) 
System.out.println("meaningfully equal");
Double i3 = 0.0;
Double i4 = 0.0;
if(i3 == i4) System.out.println("same object");
if(i3.equals(i4)) System.out.println("meaningfully equal"); 
}}

//always different