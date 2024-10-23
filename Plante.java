package DS23;

public class Plante {
protected String nom;
protected double hauteur;
protected int age;
protected double prix;
public Plante(String nom, double hauteur, int age, double prix) {
	super();
	this.nom = nom;
	this.hauteur = hauteur;
	this.age = age;
	this.prix = prix;
}
public String toString() {
	return " [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
}
public void description() {
	System.out.println(this.toString());
}
}
