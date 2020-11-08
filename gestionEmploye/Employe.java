package tn.tuniprob.gestionEmploye;

public class Employe {
private String identifiant;
private String nom;
private String adresse;
private int nbr_heures;
public void setNbr_heures(int nbr_heures) {
	this.nbr_heures = nbr_heures;
}
public String getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(String identifiant) {
	this.identifiant = identifiant;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getNbr_heures() {
	return nbr_heures;
}
public Employe(String identifiant, String nom, String adresse, int nbr_heures) {
	super();
	this.identifiant = identifiant;
	this.nom = nom;
	this.adresse = adresse;
	this.nbr_heures = nbr_heures;
}
public Employe() {
}
@Override
public String toString() {
	return "l'dientifiant : "+getIdentifiant()+"\n"+"le nom est : "+getNom()+"\n"+"l'adresse est : "+getAdresse()+"\n"+"le nombres d'heures : "+getNbr_heures();
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employe other = (Employe) obj;
	if (adresse == null) {
		if (other.adresse != null)
			return false;
	} else if (!adresse.equals(other.adresse))
		return false;
	if (identifiant == null) {
		if (other.identifiant != null)
			return false;
	} else if (!identifiant.equals(other.identifiant))
		return false;
	if (nbr_heures != other.nbr_heures)
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	return true;
}
public float calcul_salaire() {

 return 0;
}

}
