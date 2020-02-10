package org.ftninformatika.termin20;

import java.util.Date;
import java.util.List;

public class Glumac {
    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private String fotografija;
    private float ocena;
    private String datsmrti;
    private String datrodjenja;
    private List<Integer> filmId;


    public Glumac(int id, String ime, String prezime, String biografija, String fotografija, float ocena, String datsmrti, String datrodjenja, List<Integer> filmId) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.fotografija = fotografija;
        this.ocena = ocena;
        this.datsmrti = datsmrti;
        this.datrodjenja = datrodjenja;
        this.filmId = filmId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getFotografija() {
        return fotografija;
    }

    public void setFotografija(String fotografija) {
        this.fotografija = fotografija;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public String getDatsmrti() {
        return datsmrti;
    }

    public void setDatsmrti(String datsmrti) {
        this.datsmrti = datsmrti;
    }

    public String getDatrodjenja() {
        return datrodjenja;
    }

    public void setDatrodjenja(String datrodjenja) {
        this.datrodjenja = datrodjenja;
    }

    public List<Integer> getFilmId() {
        return filmId;
    }

    public void setFilmId(List<Integer> filmId) {
        this.filmId = filmId;
    }
}
