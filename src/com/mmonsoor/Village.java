package com.mmonsoor;

public class Village extends Ville {

	public Village() {
		// TODO Auto-generated constructor stub
	}

	public Village(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public Village(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feteNationale() {
		// TODO Auto-generated method stub
		String s=super.feteNationale();
		s+="Durant la fête nationale de notre ville "+nom+","+"La municipalité a fait peter 3 petards et tout le monde s'est retrouvé sur le stade."+ "et tous les "+nombreHabitants+" sont fiers d'habiter dans le plus beau village du monde";
		return s;
	}
	//On peut complètement zapper les choses de la mère
	@Override
	public void recevoirPersonnalite(String personnalite, String sujet) {
		// TODO Auto-generated method stub
		System.out.println("La personnalité "+personnalite+" vient nous visiter dans notre beau village ici à "+nom+sujet);
	}


	
	
}
