package tn.tuniprob.gestionEmploye;

public class Caissier extends Employe {
private int numeroDeCaisse;

public int getNumeroDeCaisse() {
	return numeroDeCaisse;
}

public void setNumeroDeCaisse(int numeroDeCaisse) {
	this.numeroDeCaisse = numeroDeCaisse;
}

public Caissier(String identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
	super(identifiant, nom, adresse, nbr_heures);
	this.numeroDeCaisse = numeroDeCaisse;
}
@Override
public String toString()
{return "-----Caissier----\n\n"+super.toString()+"\n"+"le numero de caisse : "+getNumeroDeCaisse();
	}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Caissier other = (Caissier) obj;
	if (numeroDeCaisse != other.numeroDeCaisse)
		return false;
	return true;
}

public Caissier() {
	super();
	
}
@Override
public float calcul_salaire() {
	float salaire=0;
	if (this.getNbr_heures()>=180)
		salaire=15*(this.getNbr_heures()*5)/100;
	else 
		salaire=this.getNbr_heures()*5;
	return salaire;
 
}
}
