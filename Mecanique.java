public class Mecanique{

    private int idMecanicien;
    private String nom;
    private String Adresse ;
    private String specialite;

    public Mecanique(int idMecanicien, String nom, String specialite) {
        this.idMecanicien = idMecanicien;
        this.nom = nom;
        this.specialite = specialite;
    }
    public int getIdMecanicien() {
        return idMecanicien;
    }
    public void setIdMecanicien(int idMecanicien) {
        this.idMecanicien = idMecanicien;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public void afficherInfos() {
        System.out.println("Mécanicien: " + nom + " (Spécialité: " + specialite + ")");
    }
}

