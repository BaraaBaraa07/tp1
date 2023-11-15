package tp1;

import java.time.LocalDate;

public class GestionEtudiants {
	 public static void main(String[] args) {
	        // Instanciation de l'objet lolo de type Etudiant
	        LocalDate dateDeNaissanceLolo = LocalDate.of(2000, 5, 15);
	        Etudiant lolo = new Etudiant("Dupont", "Jean", dateDeNaissanceLolo, "lolo@gmail.com", "adresselolo");

	        // Affichage des informations de lolo
	        System.out.println(lolo.toString());

	        // Création d'un nouvel objet toto avec les mêmes paramètres que lolo
	        Etudiant toto = new Etudiant(lolo.getNom(), lolo.getPrenom(), lolo.getDateDeNaissance(), lolo.getAdresseMail(), lolo.getAdressePostale());
	        System.out.println(toto.toString());
	        // Comparaison des deux variables avec l'opérateur ==
	        System.out.println(lolo == toto); // Renvoie false car lolo et toto sont deux objets distincts

	        // Faire en sorte que toto fasse référence à lolo
	        toto = lolo;

	        // Vérification que la modification se répercute bien sur lolo
	        toto.setNom("Toto");
	        System.out.println("information de lolo apres modification de toto"+lolo.toString()); // Affiche les informations mises à jour de lolo
	        System.out.println("Informations de toto apres modification :");
	        System.out.println(toto);  // Le nom de toto devrait être modifié
	    
	// Création d'un département
     Departement infoDept = new Departement("Informatique", "AdresseInfo");

     // Création d'étudiants
     //Etudiant lolo1 = new Etudiant("Lolo", "PrénomLolo", LocalDate.of(2000, 1, 1), "lolo@mail.com", "AdresseLolo");
     //Etudiant toto1 = new Etudiant("Toto", "PrénomToto", LocalDate.of(2001, 2, 2), "toto@mail.com", "AdresseToto");

     // Inscription des étudiants
     infoDept.inscrire(lolo);
     infoDept.inscrire(toto);

     // Affichage des informations du département (y compris les étudiants inscrits)
     System.out.println(infoDept);

     // Désinscription d'un étudiant
     infoDept.desinscrire(lolo);

     // Affichage mis à jour après la désinscription
     System.out.println("Après la desinscription de Lolo :\n" + infoDept);
     Etudiant fifi = new Etudiant("Fifi", "PrénomFifi", LocalDate.of(2002, 3, 3), "fifi@mail.com", "AdresseFifi");
     Etudiant riri = new Etudiant("Riri", "PrénomRiri", LocalDate.of(2003, 4, 4), "riri@mail.com", "AdresseRiri");

     // Création d'un département
     Departement monDepInfo = new Departement("Informatique", "AdresseDepInfo");

     // Inscription des étudiants dans le département
     monDepInfo.inscrire(lolo);
     monDepInfo.inscrire(fifi);
     monDepInfo.inscrire(toto);
     monDepInfo.inscrire(riri);

     // Affichage des informations du département (y compris les étudiants inscrits)
     System.out.println("Avant la désinscription de toto :\n" + monDepInfo);

     // Désinscription de toto du département
     monDepInfo.desinscrire(toto);

     // Affichage mis à jour après la désinscription
     System.out.println("Après la désinscription de toto :\n" + monDepInfo);
	}


		private String getAdressePostale() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getAdresseMail() {
			// TODO Auto-generated method stub
			return null;
		}

		private LocalDate getDateDeNaissance() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getPrenom() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getNom() {
			// TODO Auto-generated method stub
			return null;
		}
}