import java.util.*;

class CompareEtudiant {
    public static void main(String[] args) {
        
        ArrayList<Etudiant> a = new ArrayList<Etudiant>();

        Scanner sc = new Scanner(System.in);
		boolean cond = true;
        System.out.println("Insert students ");
		while (cond) {
			System.out.println("nom = ");
			String nom = sc.nextLine();
			System.out.println("prenom = ");
			String prenom = sc.nextLine();
			System.out.println("numero = ");
			int numero= sc.nextInt();
			System.out.println("age = ");
			int age= sc.nextInt();
			System.out.println("moyenne = ");
			float moyenne= sc.nextFloat();
			Etudiant e = new Etudiant(nom, prenom, numero,age,moyenne);
            a.add(e);
			System.out.println("type true to continue, false to exit");
			cond = sc.nextBoolean();
			sc.nextLine();
        }

        CompareByAge comp1 = new CompareByAge();
        CompareByMoyenne comp2 = new CompareByMoyenne();
        System.out.println("To sort by age, press 1. To sort by average, press 2");
        int mode = sc.nextInt();

        for (Etudiant x : a) {
            System.out.println(x.nom + " has " + x.moyenne + " average and " + x.age + " years olds");
        }
        System.out.println("\n\nSorting a elements...");
        switch (mode) {
            case 1:
                Collections.sort(a, comp1);
                break;
            case 2:
                Collections.sort(a, comp2);
                break;
            default:
                System.out.println("Invalid option");
        }

        for (Etudiant x : a) {
            System.out.println(x.nom + " has " + x.moyenne + " average and " + x.age + " years olds");
        }

    }
}