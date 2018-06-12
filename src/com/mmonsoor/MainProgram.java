package com.mmonsoor;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Ville ville1=new Ville("Port Louis",1000000);
		System.out.println(ville1.toString());
		ville1.feteNationale();
		ville1.recevoirPersonnalite("Babar"," Il va danser et chanter Billy Jean.");
		ville1.fabriquerNouveauxLogements();
		ville1.recevoirPersonnalite("Bob Dylan");
		
		
		Ville ville2=new Ville();
		System.out.println(ville2);
		
		Ville ville3=new Ville("Vacoas",12500,maire1);
		System.out.println(ville3);
		Maire maire2=new Maire("Gasnier","Yuna",30);
		ville3.electionsMunicipales(maire2);
		System.out.println(ville3);
		ville3.fabriquerNouveauxLogements();
		ville3.recevoirPersonnalite("Thor", "Je viens vous délivrer du mal et des ténèbres");
		System.out.println(ville3);
		
		**/
		
		//On crée un maire
		Maire maire1= new Maire("Monsoor","Misharl",30);
		Maire maire2=new Maire("Monsoor","Wanek",4);
		Village village=new Village("Poil", 12000);
		village.electionsMunicipales(maire1);
		System.out.println(village.feteNationale());
		//On crée une villeMoyenne
		VilleMoyenne villemoyenne1=new VilleMoyenne("Curepipe", 12000);
		System.out.println(villemoyenne1.feteNationale());
		//On crée une mégalopole
		Megalopole megalopole1=new Megalopole("Los Angeles", 40000000);
		System.out.println(megalopole1.feteNationale());
		village.recevoirPersonnalite("Hulot",". L'écologie est très importante et j'ai la main verte");
		megalopole1.recevoirPersonnalite("Misharl Monsoor",". Je vous ai compris!!!!");
		//Appelle à la méthode personnalité
		personnaliteeInviteeALaFete(village,"Nicolas Hulot");
		personnaliteeInviteeALaFete(villemoyenne1,"Nicolas Hulot");
		personnaliteeInviteeALaFete(megalopole1,"Nicolas Hulot");
		//On va créer une mégalopole culturelle
		MegalopoleCulturelle megalopoleCulturelle1=new MegalopoleCulturelle("Mon Méga lit", 15000,maire1);
		//On va créer une mégalopole culturelle
		megalopoleCulturelle1.organiserUnColloque("Un colloque sur les algues tueuses");
		megalopoleCulturelle1.ouvrirUnMusee("Musée du sommeil");
		//On va créer un village culturel
		VillageCulturel villageCulturel1=new VillageCulturel("Roscoff", 34000, maire2);
		villageCulturel1.organiserUnColloque("Manger des algues c'est bon pour la santé");
		villageCulturel1.ouvrirUnMusee("Musée de l'oignon");
		//On va créer une mégalopole industrielle et village industrielle
		MegalopoleIndustrielle megalopoleIndustrielle1= new MegalopoleIndustrielle("Port Louis by Night", 12000);
		VillageIndustrielle villageIndustrielle1= new VillageIndustrielle("Roscoff 2.0", 50000);
		megalopoleIndustrielle1.ouvrirCentreRecyclage("Notre air pure");
		villageIndustrielle1.ouvrirUneUsinePolluante("Monsanto");
		
		
	}
	
	public static void personnaliteeInviteeALaFete(Ville tmpV, String tmpPersonnalite) {
		tmpV.recevoirPersonnalite(tmpPersonnalite);
		tmpV.feteNationale();
	}
	

	
}
