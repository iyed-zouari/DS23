package DS23;

import java.util.Arrays;

public class Pepiniere {
private Plante [] inventaire;
private final int MAX_Plantes=1000;
private int nbPlantes;
public Pepiniere() {
this.nbPlantes=0;
this.inventaire =new Plante[MAX_Plantes];
}

void ajoutPlante(Plante plante) {
	if(this.nbPlantes>MAX_Plantes)
		System.out.println("impossible d'ajouter nous avons depaser le nb");
	else {
		this.inventaire[nbPlantes]=plante;
		nbPlantes++;
	}
}


public String toString() {
	return "Pepiniere [inventaire=" + Arrays.toString(inventaire) + ", MAX_Plantes=" + MAX_Plantes + ", nbPlantes="
			+ nbPlantes + "]";
}
public void afficherInventaire() {
	for (int i=0;i<this.nbPlantes;i++) {
		System.out.println("Plante#"+(i+1));
		inventaire[i].description();
	}
}
public double totaleAbsorptionTotaleCo2() {
	double s=0;
for (int i=0;i<this.nbPlantes;i++) {
	if(inventaire[i].hauteur>5000)
		s+=22+3;
	else
		s+=22;
}
return s;
} 
public int compterArbresCaduques() {
	int count =0;
	for (int i=0;i<this.nbPlantes;i++) {
		if(inventaire[i] instanceof Arbre) {
			Arbre arbre=(Arbre)inventaire[i];
			if(arbre.estCasduque()==0)
				count++;
		}
			
			
	}
	return count;}

}
