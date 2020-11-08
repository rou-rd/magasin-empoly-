package tn.tuniprob.gestionmagasin;
import java.util.Date;
import tn.tuniprob.gestionEmploye.*;

public class Magasin {
private int identifiant;

public void setProduit(Produit[] produit) {
	this.produit = produit;
}
private String adresse;
private int capacité_magasin;
final int max_capacity=50;
private String nom_magasin;
private Employe [] empolye=new Employe[max_capacity];
private int nbr_employe=0;
public String getNom_magasin() {
	return nom_magasin;
}
public int getNbr_employe() {
	return nbr_employe;
}
public void setNbr_employe(int nbr_employe) {
	this.nbr_employe = nbr_employe;
}
public void setNom_magasin(String nom_magasin) {
	this.nom_magasin = nom_magasin;
}
private int nbr_produit=0;
private Produit [] produit=new Produit[max_capacity];
public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getCapacité_magasin() {
	return capacité_magasin;
}
public void setCapacité_magasin(int capacité_magasin) {
	this.capacité_magasin = capacité_magasin;
}
public Produit[] getProduit() {
	return produit;
}
public void ajouter_empolye(Employe empolye1) {
	if (nbr_employe<max_capacity) {
		for (int i=nbr_employe;i<empolye.length;i++) {
			if((empolye[i]==null)&&(chercher_employe(empolye1)==false)) {
				this.empolye[nbr_employe]=empolye1;
				this.nbr_employe++;
				break;}
			}
		}
	else 
		System.out.println("magasin est complet");
	
}
public void ajouter_produit(Produit produit1) {
	if (nbr_produit<max_capacity) {
		for (int i=nbr_produit;i<produit.length;i++) {
			if((produit[i]==null)&&(chercher_produit(produit1)==false)) {
				this.produit[nbr_produit]=produit1;
				this.nbr_produit++;
				break;}
			}
		}
	else 
		System.out.println("magasin est complet");
	
}
/*
public void ajouter_produit(Produit produit1) {
	if (nbr_produit<max_capacity) {
		for (int i=nbr_produit;i<produit.length;i++) {
			if((produit[i].getIdentifiant()==produit1.getIdentifiant())&&(produit[i].getLibellé()==produit1.getLibellé())&&(produit[i].getPrix()==produit1.getPrix())&&(produit[i].getMarque()==produit1.getMarque()))
					System.out.println("le produit est déja ajouter");
			else {
					this.produit[nbr_produit]=produit1;
					this.nbr_produit++;}
			}
		}
	else 
		System.out.println("magasin est complet");
	
}
*/
public void afficher () {
System.out.println("****************");
System.out.println("magasin "+this.getNom_magasin());
System.out.println("****************");

System.out.println("identifiant : "+getIdentifiant());
System.out.println("Adresse : "+getAdresse());
System.out.println("capacité de magasin : "+getCapacité_magasin());
System.out.println("Nombre de produits : "+getNbr_produit());
System.out.println("nombre des employés : "+getNbr_employe());
afficher_employer();
for (int i=0;i<this.produit.length;i++) {
	if(i==0)
		System.out.println("les produit dans la magasins : ");	
	if (produit[i]!=null)
		System.out.println(produit[i]);
		
}
System.out.println("****************");

}
public int getNbr_produit() {
	return nbr_produit;
}
public void setNbr_produit(int nbr_produit) {
	this.nbr_produit = nbr_produit;
}
public Magasin(int identifiant, String adresse, int capacité_magasin,Produit produit[]) {
	this.identifiant = identifiant;
	this.adresse = adresse;
	this.capacité_magasin = capacité_magasin;
	this.produit=produit;
}
public Magasin() {
	
}
public boolean chercher_employe(Employe employe1) {
	for (int i=0;i<empolye.length;i++) {
		if(empolye[i]==null)
			return false;
		if((empolye[i].equals(employe1))&&(empolye[i]!=null))
				return true;
		}
	return false;
}
public boolean chercher_produit(Produit produit1) {
	for (int i=0;i<produit.length;i++) {
		if(produit[i]==null)
			return false;
		if((produit[i].equals(produit1))&&(produit[i]!=null))
				return true;
		}
	return false;
}
public void supprimer_produit(Produit produit1) {
	int supprimer=0;
	for (int i=0;i<produit.length;i++) {
		if((produit[i].getIdentifiant()==produit1.getIdentifiant())&&(produit[i].getLibellé()==produit1.getLibellé())&&(produit[i].getPrix()==produit1.getPrix())&&(produit[i].getMarque()==produit1.getMarque())) {
			supprimer=i;
			this.nbr_produit--;
			Produit[] produitliste = new Produit[produit.length - 1];
        	for (int j = 0; j < supprimer; j++) {
        		produitliste[j] = produit[j];
        	}
        	for (int j = supprimer + 1; j < produit.length; j++) {
        		produitliste[j - 1] = produit[j];
        	}
        	produit=produitliste;
        	break;}
		}
	
}
public static void magasin_sup(Magasin m1,Magasin m2) {
	if (m1.getNbr_produit()>m2.getNbr_produit()) 
		System.out.println("le magasin superieure:"+m1);
	else 
		System.out.println("le magasin superieure:"+m2);
	
}
/*
public boolean comparer(Produit produit1) {
	for (int i=0;i<produit.length;i++) {
		if((produit[i].getIdentifiant()==produit1.getIdentifiant())&&(produit[i].getLibellé()==produit1.getLibellé())&&(produit[i].getPrix()==produit1.getPrix()))
				return true;
		}
	return false;
}
public boolean comparer(Produit produit1,Produit produit2) {
		if((produit2.getIdentifiant()==produit1.getIdentifiant())&&(produit2.getLibellé()==produit1.getLibellé())&&(produit2.getPrix()==produit1.getPrix()))
				return true;
	return false;
}*/

public String toString() {
	return "le de magasin est "+this.getNom_magasin()+"le magasin de l'adresse "+this.getAdresse()+" de l'identifiant "+this.getIdentifiant()+"du capacité "+this.getCapacité_magasin()+"a une capacité de "+getNbr_produit();
}
public Magasin(int identifiant, String nom_magasin,String adresse,Employe employe[]) {
	super();
	this.identifiant = identifiant;
	this.adresse = adresse;
	this.nom_magasin = nom_magasin;
	this.empolye=employe;
}
public void afficher_employer () {
	
	System.out.println("**************************");
	System.out.println("les employés : ");
	for(int i=0;i<this.empolye.length;i++) {
	 if (empolye[i]!=null) { 	
		 System.out.println(empolye[i]);
		 System.out.println(" le salaire est :"+empolye[i].calcul_salaire());
		 }}
}
}
