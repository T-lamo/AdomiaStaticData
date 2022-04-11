package model;

public class DemandeSejour {
    private int idDemandeSejour;
    private Sejour sejour;
    private Voyageur voyageur;
    private boolean estValide;

    public DemandeSejour() {
    }

    public int getIdDemandeSejour() {
        return idDemandeSejour;
    }

    public DemandeSejour(int idDemandeSejour, Sejour sejour, Voyageur voyageur, boolean estValide) {
        this.idDemandeSejour = idDemandeSejour;
        this.sejour = sejour;
        this.voyageur = voyageur;
        this.estValide = estValide;
    }

    public void setIdDemandeSejour(int idDemandeSejour) {
        this.idDemandeSejour = idDemandeSejour;
    }

    public Sejour getSejour() {
        return sejour;
    }

    public void setSejour(Sejour sejour) {
        this.sejour = sejour;
    }

    public Voyageur getVoyageur() {
        return voyageur;
    }

    public void setVoyageur(Voyageur voyageur) {
        this.voyageur = voyageur;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}
