package model;

public class Voyage {
    private int idVoyage;
    private Sejour  sejour;
    private Voyageur voyageur;

    public Voyage() {
    }

    public Voyage(int idVoyage, Sejour sejour, Voyageur voyageur) {
        this.idVoyage = idVoyage;
        this.sejour = sejour;
        this.voyageur = voyageur;
    }

    public int getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(int idVoyage) {
        this.idVoyage = idVoyage;
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
}
