package model;

public class Service {
    private int idService;
    private String libelle;

    public Service() {
    }

    public Service(int idService, String libelle) {
        this.idService = idService;
        this.libelle = libelle;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
