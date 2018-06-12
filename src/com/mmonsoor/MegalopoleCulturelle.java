package com.mmonsoor;

public class MegalopoleCulturelle extends Megalopole implements VilleCulturelle {

	public MegalopoleCulturelle() {
		// TODO Auto-generated constructor stub
	}

	public MegalopoleCulturelle(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public MegalopoleCulturelle(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ouvrirUnMusee(String s) {
		// TODO Auto-generated method stub
		System.out.println("Le sujet du musée de notre mégalopole est: "+s);
	}

	@Override
	public void organiserUnColloque(String s) {
		// TODO Auto-generated method stub
		System.out.println("Le sujet de notre colloque de notre mégalopole est: "+s);
	}

}
