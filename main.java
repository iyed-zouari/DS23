package DS23;

public class main {

	public static void main(String[] args) {
		System.out.println("        pépiniere Green hands");
		Pepiniere pep=new Pepiniere();
		Fleur rose =new Fleur(null,30,12,15.99,"Rouge",2);
		Fleur tulipe =new Fleur("Tulipe",20,8,12.99,"Jaune",4);
		Arbre chene=new Arbre("chene",200,60,89.99,"Caduque");
		Arbre sapin =new Arbre ("sapin",150,30,59.99,"Persistant");
		rose.setNom("Rose");
		System.out.println("la"+rose.getNom()+"a le couleur"+rose.getCouleur());
		pep.ajoutPlante(rose);
		pep.ajoutPlante(tulipe);
		pep.ajoutPlante(chene);
		pep.ajoutPlante(sapin);
		pep.afficherInventaire();
		System.out.println("Total Abrorption CO2     "+pep.totaleAbsorptionTotaleCo2());
		System.out.println("nombre d'arbre caduques dans la pepiniere: "+pep.compterArbresCaduques());
	}

}
