package DS23;

public class Fleur extends Plante {
private String couleur;
private int moisF;
public Fleur(String nom, double hauteur, int age, double prix,String couleur,int moisF) {
	super(nom, hauteur, age, prix);
	this.couleur=couleur;
	this.moisF=moisF;
}
@Override
public String toString() {
	return super.toString()+"Fleur [couleur=" + couleur + ", moisF=" + moisF + "]";
}
public void description() {
	super.description();
	fleurir();
}
public void fleurir() {
	if (this.moisF==4 || this.moisF==5 || this.moisF==6)
		System.out.println("La fleur est considérée en fleurs");
	else
		System.out.println("non,La fleur n'est pas considérée en fleurs");
}
public void setNom(String string) {
	this.nom=string;
	
}
public String getCouleur() {
	return this.couleur;
}
public String getNom() {
	// TODO Auto-generated method stub
	return this.nom;
}


}
