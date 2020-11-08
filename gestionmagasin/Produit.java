package tn.tuniprob.gestionmagasin;
import java.util.Date;
public class Produit {
	
private int identifiant;
private String libell�;
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
public String getLibell�() {
return libell�;
}
public void setLibell�(String libell�) {
this.libell� = libell�;
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
public Produit(int identifiant, String libell�, String marque, float prix) {
this.identifiant = identifiant;
this.libell� = libell�;
this.marque = marque;
this.prix = prix;

}
public Produit(int identifiant, String libell�, String marque, float prix,Date date) {
this.identifiant = identifiant;
this.libell� = libell�;
this.marque = marque;
this.prix = prix;
this.date = date;
}
public Produit(int identifiant, String libell�, String marque) {
this.identifiant = identifiant;
this.libell� = libell�;
this.marque = marque;
}

public void afficher () {
System.out.println("****************");
System.out.println("identifiant : "+getIdentifiant());
System.out.println("libell� : "+getLibell�());
System.out.println("marque : "+getMarque());
System.out.println("prix : "+getPrix());
System.out.println("date:"+getDate());
System.out.println("****************");

}
public String toString() {
	return "identifiant : "+getIdentifiant()+"  libell� : "+getLibell�()+"  marque : "+getMarque()+"   prix : "+getPrix()+"   date:  "+getDate();
}
static boolean comparer(Produit produit1,Produit produit2) {
	if((produit2.getIdentifiant()==produit1.getIdentifiant())&&(produit2.getLibell�()==produit1.getLibell�())&&(produit2.getPrix()==produit1.getPrix()))
			return true;
return false;
}
public boolean comparer(Produit produit1) {
		if((this.getIdentifiant()==produit1.getIdentifiant())&&(this.getLibell�()==produit1.getLibell�())&&(this.getPrix()==produit1.getPrix()))
				return true;
	return false;
}
public boolean equals(Produit produit1) {
	if((this.getIdentifiant()==produit1.getIdentifiant())&&(this.getLibell�()==produit1.getLibell�())&&(this.getPrix()==produit1.getPrix())) {
		return true;
	}
	return false;
}
}
