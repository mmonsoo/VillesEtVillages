package com.mmonsoor;

public abstract class Ville {
	//Attributs de la classe Ville
	protected String nom;
	protected int nombreHabitants;
	protected int nbLogements=0;
	protected Maire maire;
	//Constructeur
	public Ville() {
		nom="Je n'ai pas nom encore";
		nombreHabitants=0;
		nbLogements=0;
		maire=null;
	}
	
	public Ville(String tmpNom,int tmpNombreHabitants) {
		nom=tmpNom;
		nombreHabitants=tmpNombreHabitants;
		maire=null;
	}
	public Ville(String tmpNom,int tmpNombreHabitants,Maire tmpMaire) {
		nom=tmpNom;
		nombreHabitants=tmpNombreHabitants;
		maire=tmpMaire;
	}
	@Override
	public String toString() {
		
		if(maire!=null) {
			return "La Ville " + nom + "a un nombre habitants de " + nombreHabitants + ". Et cette ville a "+nbLogements+" logements. Le maire de la ville dit: "+maire.toString();
		}
		else {
			return "La Ville " + nom + "a un nombre habitants de " + nombreHabitants + ". Et cette ville a "+nbLogements+" logements. Cette ville n'a pas encore de maire";

		}
		
	}
	/*
	 * M�thode indiquant le d�roule de la f�te nationale
	 */
	public String feteNationale() {
		return ("");
	}
	public void recevoirPersonnalite(String personnalite, String sujet) {
		System.out.println("La personnalit� "+personnalite+" vient nous visiter ici � "+nom+sujet);
	}
	public void recevoirPersonnalite(String personnalite) {
		System.out.println("La personnalit� "+personnalite+" vient nous visiter ici � "+nom+". Il n'a aucun sujet � d�fendre");
	}
	
	public void fabriquerNouveauxLogements() {
		nbLogements++;
	}
	
	public void electionsMunicipales(Maire m) {
		maire=m;
		
	}
	
	

}
