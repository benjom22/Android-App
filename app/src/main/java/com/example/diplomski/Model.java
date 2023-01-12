package com.example.diplomski;

public class Model {
    private String materijal, kolicina, id, date;

    public Model(String materijal, String kolicina, String id, String date) {
        this.materijal = materijal;
        this.kolicina = kolicina;
        this.id = id;
        this.date = date;
    }

    public String getMaterijal() {
        return materijal;
    }

    public void setMaterijal(String materijal) {
        this.materijal = materijal;
    }

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
