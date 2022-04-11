/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author amos
 */
public class Sejour {

    private int idSejour;
    private Hote Hote;
    private Service service;
    private StringProperty pays;
    private StringProperty ville;
    private StringProperty zip;
    private StringProperty addresse;
    private StringProperty dateDebut;
    private StringProperty dateFin;
    private int nbrVoyageur;
    private StringProperty description;

    public Sejour() {
    }

    public Sejour(int idSejour, model.Hote hote, Service service, String pays, String ville, int nbrVoyageur) {
        this.idSejour = idSejour;
        Hote = hote;
        this.service = service;
        paysProperty().set(pays);
        villeProperty().set(ville);
        this.nbrVoyageur = nbrVoyageur;
    }

    public Sejour(int idSejour, model.Hote hote, Service service, StringProperty pays, StringProperty ville, StringProperty zip, StringProperty addresse, StringProperty dateDebut, StringProperty dateFin, int nbrVoyageur, StringProperty description) {
        this.idSejour = idSejour;
        Hote = hote;
        this.service = service;
        this.pays = pays;
        this.ville = ville;
        this.zip = zip;
        this.addresse = addresse;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbrVoyageur = nbrVoyageur;
        this.description = description;
    }

    public int getIdSejour() {
        return idSejour;
    }

    public void setIdSejour(int idSejour) {
        this.idSejour = idSejour;
    }

    public model.Hote getHote() {
        return Hote;
    }

    public void setHote(model.Hote hote) {
        Hote = hote;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public StringProperty getPays() {
        return pays;
    }

    public void setPays(StringProperty pays) {
        this.pays = pays;
    }

    public StringProperty getVille() {
        return ville;
    }

    public void setVille(StringProperty ville) {
        this.ville = ville;
    }

    public StringProperty getZip() {
        return zip;
    }

    public void setZip(StringProperty zip) {
        this.zip = zip;
    }

    public StringProperty getAddresse() {
        return addresse;
    }

    public void setAddresse(StringProperty addresse) {
        this.addresse = addresse;
    }

    public StringProperty getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(StringProperty dateDebut) {
        this.dateDebut = dateDebut;
    }

    public StringProperty getDateFin() {
        return dateFin;
    }

    public void setDateFin(StringProperty dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbrVoyageur() {
        return nbrVoyageur;
    }

    public void setNbrVoyageur(int nbrVoyageur) {
        this.nbrVoyageur = nbrVoyageur;
    }

    public StringProperty getDescription() {
        return description;
    }

    public void setDescription(StringProperty description) {
        this.description = description;
    }

    public StringProperty paysProperty() {
        if (pays == null) pays = new SimpleStringProperty(this, "pays");
        return pays;
    }

    public StringProperty villeProperty() {
        if (ville == null) ville = new SimpleStringProperty(this, "ville");
        return ville;
    }


}
