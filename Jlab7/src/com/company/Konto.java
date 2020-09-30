package com.company;

public class Konto {

    private int kontonummer;
    private int saldo;


    public Konto (int kontonummer,int saldo){
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static int samletVerdi(Konto nk1, Konto nk2, Konto nk3) {
        return nk1.getSaldo()+nk2.getSaldo()+nk3.getSaldo();
    }

    public void skrivUt() {

        System.out.println("Kontonummer: " + kontonummer + " " + "Saldo: " + saldo);

    }
}
