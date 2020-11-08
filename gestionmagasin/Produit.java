package tn.tuniprob.gestionmagasin;
import java.util.Date;
public class Produit {
	
private int identifiant;
private String libellé;
private String marque;
private float prix;
private Date date;
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Produit() {

}
public int getIdentifiant() {
return identifiant;
}
public void setIdentifiant(int identifiant) {
this.identifiant = identifiant;
}
public String getLibellé() {
return libellé;
}
public void setLibellé(String libellé) {
this.libellé = libellé;
}
public String getMarque() {
return marque;
}
public void setMarque(String marque) {
this.marque = marque;
}
public float getPrix() {
return prix;
}
public void setPrix(float prix) {
this.prix = prix;
}
public Produit(int identifiant, String libellé, String marque, float prix) {
this.identifiant = identifiant;
this.libellé = libellé;
this.marque = marque;
this.prix = prix;

}
public Produit(int identifiant, String libellé, String marque, float prix,Date date) {
this.identifiant = identifiant;
this.libellé = libellé;
this.marque = marque;
this.prix = prix;
this.date = date;
}
public Produit(int identifiant, String libellé, String marque) {
this.identifiant = identifiant;
this.libellé = libellé;
this.marque = marque;
}

public void afficher () {
System.out.println("****************");
System.out.println("identifiant : "+getIdentifiant());
System.out.println("libellé : "+getLibellé());
System.out.println("marque : "+getMarque());
System.out.println("prix : "+getPrix());
System.out.println("date:"+getDate());
System.out.println("****************");

}
public String toString() {
	return "identifiant : "+getIdentifiant()+"  libellé : "+getLibellé()+"  marque : "+getMarque()+"   prix : "+getPrix()+"   date:  "+getDate();
}
static boolean comparer(Produit produit1,Produit produit2) {
	if((produit2.getIdentifiant()==produit1.getIdentifiant())&&(produit2.getLibellé()==produit1.getLibellé())&&(produit2.getPrix()==produit1.getPrix()))
			return true;
return false;
}
public boolean comparer(Produit produit1) {
		if((this.getIdentifiant()==produit1.getIdentifiant())&&(this.getLibellé()==produit1.getLibellé())&&(this.getPrix()==produit1.getPrix()))
				return true;
	return false;
}
public boolean equals(Produit produit1) {
	if((this.getIdentifiant()==produit1.getIdentifiant())&&(this.getLibellé()==produit1.getLibellé())&&(this.getPrix()==produit1.getPrix())) {
		return true;
	}
	return false;
}
}
