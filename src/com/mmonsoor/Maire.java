package com.mmonsoor;

public class Maire {
	private String nom;
	private String prénom;
	private int age;
	
	public Maire(String tmpNom,String tmpPrenom,int tmpAge) {
		nom=tmpNom;
		prénom=tmpPrenom;
		age=tmpAge;	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Je suis le maire et je m'appelle " + nom + " " + prénom + " "+"et j'ai "+age+" ans.";
	}
	
	
	

}
