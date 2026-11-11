package examan2014;

public class ConditionAge implements  ConditionAcces {
	private int ageMin ;

	public ConditionAge(int ageMin) {
		this.ageMin = ageMin;
	}
	
	
	public int getAgeMin() {
		return ageMin;
	}


	public boolean accesPossible(personne p ) {
		if (p.getAge()>this.ageMin) {
			return true ;
		}
		return false ;
		
	}
}
