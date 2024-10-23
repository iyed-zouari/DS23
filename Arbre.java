package DS23;

public class Arbre extends Plante {
private String type_Feuillage;
private final int AbsorMoyenne=22;
public Arbre(String nom, double hauteur, int age, double prix,String type_Feuillage) {
	super(nom, hauteur, age, prix);
	this.type_Feuillage=type_Feuillage;
}

public String toString() {
	return super.toString()+"Arbre [type_Feuillage=" + type_Feuillage + ", AbsorMoyenne=" + AbsorMoyenne + "]";
}
public void description() {
	super.description();
}
public double absorptionCo2() {
	if (hauteur>5000)
		return AbsorMoyenne+3;
	else
		return AbsorMoyenne;
}

public int estCasduque() {
	return type_Feuillage.compareTo("Caduque");
}


}
