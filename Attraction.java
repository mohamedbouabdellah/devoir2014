package examan2014;

public class Attraction {
	private String nom ;
	private double cout ;
	private ConditionAge conage ;
	private int nbp;
	private double recette ;
	public Attraction(String nom, double cout, ConditionAge conage) {
		this.nom = nom;
		this.cout = cout;
		this.conage = conage;
		this.nbp = 0;
		this.recette = 0;
	}
	
	public double getRecette() {
		return recette;
	}



	public void affiche() {
		System.out.println("le nom est :"+nom);
		System.out.println("le cout est :"+cout);
		System.out.println("le Nombre de personne est :"+nbp);
		System.out.println("le Age Min est :"+conage.getAgeMin());
		System.out.println("la recette est :"+recette);
		System.out.println("----------------");
			
	}
	public boolean utilise(personne p) {
		if (!conage.accesPossible(p)) {
			return false ;
		}
		else {
			nbp++ ;
			recette+=cout ;
			return true ;
		}
	}

	
	

}
