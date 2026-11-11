package examan2014;

public class ParcAttraction {
	private Attraction lesAttractions[] ;
	private String nom ;
	private int nb_attraction ;
	private int taille ;
	
	
	public ParcAttraction(String nom, int taille) {
		this.nom=nom ;
		this.nb_attraction=0 ;
		this.taille = taille ;
		this.lesAttractions=new Attraction[taille] ;
	}
	
	public void ajouteAttraction (Attraction a) {
		if (nb_attraction<taille) {
			lesAttractions[nb_attraction]=a ;
			nb_attraction ++ ;
			
		}
		else {
			System.out.println("Imposible d'ajouter !!");
		}
	}
	
	
	public double getRecette() {
		double somme = 0 ;
		for (int i =0 ; i<nb_attraction ; i++) {
			somme += lesAttractions[i].getRecette() ;
		}
		
		return somme ;
	}
	
	public void affiche() {
		System.out.println("Le nom du Parc :" + nom);
		for (int i = 0 ; i<nb_attraction ; i++) {
			lesAttractions[i].affiche();
		}
		System.out.println("Recette totale : " + getRecette());
	}
	
}

























