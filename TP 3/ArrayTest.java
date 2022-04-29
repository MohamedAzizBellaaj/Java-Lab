public class ArrayTest{
public static void main(String [] args){
	int[] tab1 = new int[10];
	int s=0;
	for(int i=0;i<10;i++){
		s+=i;
		tab1[i]=s;
		
	}
	System.out.println("tab1 contient");
	for(int i=0;i<10;i++){
		System.out.print(tab1[i] + " ");
	}
	int tab2 [] = new int[10];
	for(int i=0;i<10;i++){
		tab2[i]=i;
	}
	System.out.println();
	System.out.println("tab2 contient les entier de 0 à 9");
	for(int i=0;i<10;i++){
		System.out.print(tab2[i] + " ");
	}
	int tab3 [] = new int[10];
	for(int i =0; i<10;i++){
		tab3[i]=tab1[i]-tab2[i];
	}
	System.out.println();
	System.out.println("tab3 contient la différence entre tab1 et tab12");
	for(int i=0;i<10;i++){
		System.out.print(tab3[i] + " ");
	}
	//compte rendu 1
}
}