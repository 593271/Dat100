package com.company;


public class Vare {



    private int varenr;
    private String navn;
    private double pris;



    public Vare(int varenr, String navn, double pris) {
        this.varenr = varenr;
        this.navn = navn;
        this.pris = pris;

    }

    public int getVarenr() {
        return varenr;

    }

    public void setVarenr(int varenr) {
        this.varenr = varenr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {

        this.navn = navn;

    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double beregnMoms() {
        double moms = pris*0.20;
        return moms;
    }

    public String toString() {

        return varenr + " " + pris + " " + navn;
    }

    public boolean erBilligereEnn(Vare v2,Vare v1) {
        boolean billigere = true;

        if (v2.getPris() > v1.getPris()) {
            billigere = false;
        }
        System.out.println(billigere);
        return billigere;

    }

}