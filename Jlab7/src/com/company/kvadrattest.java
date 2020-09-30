package com.company;

public class kvadrattest {


    public static void main(String[] args) {


        Kvadrat k1 = new Kvadrat(8);
        k1.skrivUt();
        System.out.println("omkretsen når sidelengde er 8 blir : " + k1.omkrets(8));
        System.out.println("arealet når sidelengden er 8 blir : " + k1.arealet(8));


    }

}
