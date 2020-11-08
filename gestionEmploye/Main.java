package tn.tuniprob.gestionEmploye;
import java.util.Date;

import tn.tuniprob.gestionmagasin.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employe e1[]= new  Employe[10];
		Employe e2[]= new  Employe[10];
		Magasin m1=new Magasin(1,"Carrefour","Centre-ville",e1);
		Magasin m2=new Magasin(2,"Monoprix","Menzah 6",e2);
		Employe c1m1=new Caissier("SAMEH","mourouj4","salah",25,500);
		Employe c2m1=new Caissier("radwene","ben arous","saah",64,520);
		Employe v1m1=new Vendeur("sami","souusa","salah",5,5);
		Employe r1m1=new Responsable("khaled","slimane","salah",45,20);
		m1.ajouter_empolye(c1m1);
		m1.ajouter_empolye(c2m1);
		m1.ajouter_empolye(v1m1);
		m1.ajouter_empolye(r1m1);
		Employe v2m2=new Vendeur("samia","marsa","lah",45,15);
		Employe v3m2=new Vendeur("imed","kram","slah",32,15);
		Employe v4m2=new Vendeur("sarra","tunis","salah",25,15);
		Employe r2m2=new Responsable("bacem","touzer","salh",16,50);
		m2.ajouter_empolye(v2m2);
		m2.ajouter_empolye(v3m2);
		m2.ajouter_empolye(v4m2);
		m2.ajouter_empolye(r2m2);
		
		
		Date date5 = new Date(2020-1900,3-1,8-1);
		Produit p5=new Produit(3325,"Tomate","Sicam",1.2570f,date5);
		Date date6 = new Date(2021-1900,3-1,8-1);
		Produit p6=new Produit(3355,"tata","xione",1.2650f,date5);
		m1.ajouter_produit(p5);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		Produit [] produit2 =new Produit[50];
		m2.ajouter_produit(p5);
		m2.ajouter_produit(p6);
		m1.afficher();
		m2.afficher();
		
		//tout les question sont affiché dans la methode affiche !!		
		
	}

}
