package model;

public class Hote {
    private int idHote;
    private String prenom;
    private String nom;
    private String datenaissance;
    private String email;
    private String ville;
    private String pays;
    private String adresse;
    private String description;

    public Hote() {
    }

    public Hote(int idHote, String prenom, String nom) {
        this.idHote = idHote;
        this.prenom = prenom;
        this.nom = nom;
    }

    public Hote(int idHote, String prenom, String nom, String datenaissance, String email, String ville, String pays, String adresse, String description) {
        this.idHote = idHote;
        this.prenom = prenom;
        this.nom = nom;
        this.datenaissance = datenaissance;
        this.email = email;
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
        this.description = description;
    }

    public int getIdHote() {
        return idHote;
    }

    public void setIdHote(int idHote) {
        this.idHote = idHote;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
