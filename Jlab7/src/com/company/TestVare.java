package com.company;

public class TestVare {

    public static void main(String[] args) {
        Vare v1 = new Vare(5,"Melk", 100.00);
        Vare v2 = new Vare(5,"Melk", 19.00);
        v1.erBilligereEnn(v2,v1);
        System.out.println(v1.beregnMoms());
        System.out.println(v1.toString());
        v1.setNavn("Gulrot");
        v1.setPris(100.00);
        v1.setVarenr(666);
        System.out.println(v1.getVarenr() + " " + v1.getNavn() + " " + v1.getPris());

    }

}
