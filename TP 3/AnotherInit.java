public class AnotherInit{
	AnotherInit(){System.out.println("AnotherInit no-arg const"); 	}
	static { System.out.println("AnotherInit 1st static init"); }
 { System.out.println("AnotherInit 1st instance init"); }
 { System.out.println("AnotherInit 2nd instance init"); }
 static { System.out.println("AnotherInit 2nd static init"); }


}