package tp1;


import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String adresseMail;
    private String adressePostale;

    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateDeNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresseMail='" + adresseMail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }

    // Méthode setNom
    public void setNom(String nom) {
        this.nom = nom;
    }

	public String getPrenom() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public LocalDate getDateDeNaissance() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAdresseMail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAdressePostale() {
		// TODO Auto-generated method stub
		return null;
	}

}
