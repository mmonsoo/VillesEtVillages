package com.mmonsoor;

public class Maire {
	private String nom;
	private String pr�nom;
	private int age;
	
	public Maire(String tmpNom,String tmpPrenom,int tmpAge) {
		nom=tmpNom;
		pr�nom=tmpPrenom;
		age=tmpAge;	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Je suis le maire et je m'appelle " + nom + " " + pr�nom + " "+"et j'ai "+age+" ans.";
	}
	
	
	

}
