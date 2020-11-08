package tn.tuniprob.gestionEmploye;

public class Vendeur extends Employe{
private int tauxDeVente;


public Vendeur(String identifiant, String nom, String adresse, int nbr_heures, int tauxDeVente) {
	super(identifiant, nom, adresse, nbr_heures);
	this.tauxDeVente = tauxDeVente;
}

public int getTauxDeVente() {
	return tauxDeVente;
}

public void setTauxDeVente(int tauxDeVente) {
	this.tauxDeVente = tauxDeVente;
}
public Vendeur() {
	
}
@Override
public String toString() {
	{return "-----Vendeur----\n\n"+super.toString()+"\n"+"le taux de ventre : "+getTauxDeVente();
	}
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vendeur other = (Vendeur) obj;
	if (tauxDeVente != other.tauxDeVente)
		return false;
	return true;
}
@Override
public float calcul_salaire() {
	float salaire=0;
		salaire=450+(450*getTauxDeVente())/100;
	return salaire;
 
}
}
