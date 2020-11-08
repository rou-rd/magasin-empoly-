package tn.tuniprob.gestionEmploye;

public class Responsable extends Employe{
public Responsable(String identifiant, String nom, String adresse, int nbr_heures, float prime) {
		super(identifiant, nom, adresse, nbr_heures);
		this.prime = prime;
	}

@Override
public String toString()
{return "-----Responsable ----\n\n"+super.toString()+"\n"+"le prime  : "+getPrime();
	}

public Responsable() {
		super();
		
	}

private float prime;

public float getPrime() {
	return prime;
}

public void setPrime(float prime) {
	this.prime = prime;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Responsable other = (Responsable) obj;
	if (Float.floatToIntBits(prime) != Float.floatToIntBits(other.prime))
		return false;
	return true;
}
@Override
public float calcul_salaire() {
	float salaire=0;
	if (this.getNbr_heures()>=160)
		salaire=(20*((this.getNbr_heures()*10)+prime))/100;
	else 
		salaire=this.getNbr_heures()*10+prime;
	return salaire;
 
}
}
