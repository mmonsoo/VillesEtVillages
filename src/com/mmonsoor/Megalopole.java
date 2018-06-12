package com.mmonsoor;

public class Megalopole extends Ville {

	public Megalopole() {
		// TODO Auto-generated constructor stub
	}

	public Megalopole(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public Megalopole(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String feteNationale() {
		// TODO Auto-generated method stub
		String s=super.feteNationale();
		s+="Durant la fête nationale de notre mégalopole, "+nom+","+"Un immense feu d'article en sons et lumières a ete tire et d'immenses beuveries ont pris place dans tous les espaces verts."+ "et tous les "+nombreHabitants+" sont fiers d'habiter dans la plus belle mégalopoile du monde";
		return s;
	}
	
	@Override
	public void recevoirPersonnalite(String personnalite, String sujet) {
		// TODO Auto-generated method stub
		System.out.println("La personnalité "+personnalite+" vient nous visiter dans notre belle mégalopole ici à "+nom+sujet);
	}
	

}
