package com.mmonsoor;

public class MegalopoleIndustrielle extends Megalopole implements VilleIndustrielle {

	public MegalopoleIndustrielle() {
		// TODO Auto-generated constructor stub
	}

	public MegalopoleIndustrielle(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public MegalopoleIndustrielle(String tmpNom, int tmpNombreHabitants, Maire tmpMaire) {
		super(tmpNom, tmpNombreHabitants, tmpMaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ouvrirUneUsinePolluante(String s) {
		System.out.println("On a ouvert une usine polluante dans notre mégalopole"+nom+" s'appelant: "+s);
	}

	@Override
	public void ouvrirCentreRecyclage(String s) {
		// TODO Auto-generated method stub
		System.out.println("On a ouvert un centre de recyclage dans notre mégalopole "+nom+"s'appelant"+s);
	}

}
