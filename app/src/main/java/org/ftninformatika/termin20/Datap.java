package org.ftninformatika.termin20;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Datap {
    DateFormat df= DateFormat.getDateInstance();
    private List<Glumac> glumci=new ArrayList<>();
    private List<Filmovi> filmovi=new ArrayList<>();
    private static Datap _instance;

    public  Datap getInstance() {
        if (_instance == null) {
            _instance = new Datap();
        }
        return _instance;
    }



    public Datap() {
        imenaGlumaca();
        imenaFilmova();
    }

    private void imenaGlumaca(){
        glumci= new ArrayList<>();
        glumci.add(new Glumac(0,"Dzoni","Depp","Glumac u akcionim i komedijama","",3,"","1978",getFilmoviId()));
        glumci.add(new Glumac(1,"Silvester","Stalone","Glumac u akcionim filmovima","",4,"","1978",getFilmoviId()));
        glumci.add(new Glumac(2,"Arnold","Svajcineger","Glumac u akcionim","",5,"","1987",getFilmoviId()));
        glumci.add(new Glumac(3,"Milos","Bikovic","Glumac u akcionim,komedijama i drugim","",4.5f,"","1987",getFilmoviId()));


    }

    private void imenaFilmova() {
        filmovi = new ArrayList<>();
        filmovi.add(new Filmovi(0, "Pirati sa kariba"));
        filmovi.add(new Filmovi(1, "Rambo"));
        filmovi.add(new Filmovi(2, "Terminator"));
        filmovi.add(new Filmovi(3, "Sluga"));
    }

    public Filmovi getFilmoviById(int id) {
        switch (id) {
            case 0:
                return filmovi.get(0);
            case 1:
                return filmovi.get(1);
            case 2:
                return filmovi.get(2);
            case 3:
                return filmovi.get(3);
            default:
                return null;
        }
    }
    public Glumac getGlumacById(int id) {

        switch (id) {
            case 0:
                return glumci.get(0);
            case 1:
                return glumci.get(1);
            case 2:
                return glumci.get(2);
            case 3:
                return glumci.get(3);
            default:
                return null;
        }
    }

    public List<Integer> getFilmoviId(){
        List<Integer> filmoviId=new ArrayList<>();
        for (int i=0;i<filmovi.size();i++){
            filmoviId.add(filmovi.get(i).getId());
        }
        return filmoviId;
    }

    public List<Glumac> getGlumci() {
        return glumci;
    }

    public List<Filmovi> getFilmovi() {
        return filmovi;
    }
}
