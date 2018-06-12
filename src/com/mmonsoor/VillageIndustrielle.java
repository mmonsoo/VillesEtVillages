package com.mmonsoor;

public class VillageIndustrielle extends Village implements VilleIndustrielle {

	public VillageIndustrielle() {
		// TODO Auto-generated constructor stub
	}

	public VillageIndustrielle(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public VillageIndustrielle(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ouvrirUneUsinePolluante(String s) {
		System.out.println("On a ouvert une usine dans notre village "+nom+ "polluante s'appelant"+s);

	}

	@Override
	public void ouvrirCentreRecyclage(String s) {
		System.out.println("On a ouvert un centre de recyclage dans notre village "+nom+" s'appelant: "+s);
	}

}
