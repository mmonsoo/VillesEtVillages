package com.mmonsoor;

public class VillageCulturel extends Village implements VilleCulturelle {

	public VillageCulturel() {
		// TODO Auto-generated constructor stub
	}

	public VillageCulturel(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public VillageCulturel(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ouvrirUnMusee(String s) {
		System.out.println("Le sujet du musée de notre village culturel est: "+s);

	}

	@Override
	public void organiserUnColloque(String s) {
		System.out.println("Le sujet du musée de notre village culturel est: "+s);

	}

}
