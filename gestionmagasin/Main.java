package tn.tuniprob.gestionmagasin;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Prosit 1 Gestion de Magasin (1)
		Produit p1=new Produit();
		Produit p2= new Produit(1021,"lait","Delice");
		Produit p3=new Produit(1021,"Yaourt","Vitalait");
		
		Date date1 = new Date(2020-1900,2-1,4-1);
		Date date2 = new Date(2020-1900,5-1,6-1);
		Date date3 = new Date(2020-1900,4-1,7-1);
		Date date4 = new Date(2020-1900,3-1,8-1);
		Produit p4=new Produit(3250,"Tomate","Sicam",1.200f);
		
		p1.afficher();
		p2.afficher();
		p3.afficher();
		p4.afficher();
		
		p2.setPrix(0.700f);
		p3.setPrix(0.700f);
		p1.setIdentifiant(3256);
		p1.setLibellé("saida");
		p1.setMarque("chocotome");
		p1.setPrix(0.800f);
		p1.setDate(date1);
		p2.setDate(date2);
		p3.setDate(date3);
		p4.setDate(date3);
		p1.afficher();
		
		p2.afficher();
		p3.afficher();
		p4.afficher();
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4);
		System.out.println("prosit 1 end Gestion de Magasin (1)");
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("prosit 2 start Gestion de Magasin (2)");
		Produit [] produit1 =new Produit[50];
		Magasin m1=new Magasin(1234,"34 rue russie mourouj 6",22,produit1);
		Date date5 = new Date(2020-1900,3-1,8-1);
		Produit p5=new Produit(3325,"Tomate","Sicam",1.200f,date5);
		Date date6 = new Date(2021-1900,3-1,8-1);
		Produit p6=new Produit(3355,"tata","xione",1.200f,date5);
		m1.ajouter_produit(p5);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		m1.ajouter_produit(p6);
		Produit [] produit2 =new Produit[50];
		Magasin m2=new Magasin(12354,"336 rue brésile tatouine",22,produit2);
		m2.ajouter_produit(p5);
		m2.ajouter_produit(p6);
		System.out.println("prosit 3 start Gestion de Magasin (3)");
		System.out.println("la comparaison entre deux produit  methode 1 :"+p5.comparer(p5));
		System.out.println("la comparaison entre deux produit  methode 1 :"+Produit.comparer(p5,p5));
		
		
		m1.afficher();
		m1.supprimer_produit(p5);
		m1.afficher();
		Magasin.magasin_sup(m1,m2);
		
	}

}
