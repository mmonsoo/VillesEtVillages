package com.mmonsoor;

public class VilleMoyenne extends Ville {

	public VilleMoyenne() {
		// TODO Auto-generated constructor stub
	}

	public VilleMoyenne(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public VilleMoyenne(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String feteNationale() {
		// TODO Auto-generated method stub
		String s=super.feteNationale();
		s+="Durant la fête nationale de notre ville moyenne "+nom+","+"Quelques feux d'artifices ont été tirés et plusieurs fêtes ont eu lieu jusqu'a tard."+ "et tous les "+nombreHabitants+" sont fiers d'habiter dans la plus belle ville du monde";
		return s;
	}
	
	@Override
	public void recevoirPersonnalite(String personnalite, String sujet) {
		// TODO Auto-generated method stub
		System.out.println("La personnalité "+personnalite+" vient nous visiter dans notre belle ville moyenne ici à "+nom+sujet);
	}

}
