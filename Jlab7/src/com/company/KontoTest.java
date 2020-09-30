package com.company;

public class KontoTest {

    public static void main(String[] args) {
        Konto nk1 = new Konto(2343523, 1);
        Konto nk2 = new Konto(2222, 2);
        Konto nk3 = new Konto(66666, 3);

        nk1.skrivUt();
        System.out.println(nk1.getKontonummer());
        nk1.setKontonummer(99999);
        System.out.println(nk1.getKontonummer());
        System.out.println(nk3.samletVerdi(nk1,nk2,nk3));
    }


}
