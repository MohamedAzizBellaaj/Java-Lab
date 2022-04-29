import java.util.*;
import java.io.*;
class FileClass1{
	public static void main(String [] args){
		int i;
		System.out.println("File Manipulation : choisir une commande");
		do{
			System.out.println("1 : pwd");
			System.out.println("2 : ls");
			System.out.println("3 : mkdir");
			System.out.println("4 : cat");
			System.out.println("5 : copy");
			System.out.println("6 : catWrite");
			System.out.println("99 : quitter");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			System.out.println("");
			switch(i){
				case 1:
					System.out.println("Traitement du choix 1 : pwd ... ");
					Pwd.main(args);
                    System.out.println("");
					break;
				case 2:{
					System.out.println("Traitement du choix 2 : ls ... ");
					Ls.main(args);
                    System.out.println("");
					}
					break;
				case 3:{
					System.out.println("Traitement du choix 3 : mkdir ... ");
					String argument = sc.next();
                    String[] x = { argument };
                    Mkdir.main(x);
                    System.out.println("");
					}
					break;
				case 4:{
					System.out.println("Traitement du choix 4 : cat ... ");
					String argument = sc.next();
                    String[] x = { argument };
                    Cat.main(x);
                    System.out.println("");
					}
					break;
				case 5:{
					System.out.println("Traitement du choix 5 : copy ... ");
					String argument1 = sc.next();
					String argument2 = sc.next();
                    String[] x = { argument1, argument2 };
                    Copy.main(x);
					System.out.println("");
					}
					break;
				case 6:{
					System.out.println("Traitement du choix 6 : write in file ... ");
					String argument = sc.next();
                    String[] x = { argument };
                    CatWrite.main(x);
					System.out.println("");
					}
					break;
				default:
                    System.out.println("Choix invalide");
					break;
			}
		}while(i!=99);
	}
}