package tp1;

import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> etudiantsInscrits;

    // Constructeur
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Département de " + specialite + " - Adresse : " + adresse + "\n");
        result.append("Liste des étudiants inscrits :\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            result.append(etudiant).append("\n");
        }
        return result.toString();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }}