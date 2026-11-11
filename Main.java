package examan2014;

public class Main {
    public static void main(String[] args) {
        ConditionAge condition = new ConditionAge(12);
        Attraction grandHuit = new Attraction("Grand huit", 8.5, condition);
        Attraction carrousel = new Attraction("Carrousel",3.0,new ConditionAge(0));
        
        ParcAttraction parc = new ParcAttraction("Parc Aventure",5) ;
        parc.ajouteAttraction(grandHuit);
        parc.ajouteAttraction(carrousel);

        personne adulte = new personne(25, 175,"Mohamed");
        personne enfant = new personne(8, 120,"Amine");

        System.out.println("Adulte utilise le grand huit : "+ grandHuit.utilise(adulte));
        System.out.println("Enfant utilise le grand huit : "+ grandHuit.utilise(enfant));
        System.out.println("Enfant utilise le carrousel : "+ carrousel.utilise(enfant));
        System.out.println("\nInformations du parc :");
        parc.affiche();
        
    }
}