package com.company;

public class Kvadrat {


    private int sidelengde;


    public Kvadrat(int startSidelengde) {
        sidelengde = startSidelengde;
    }

    public int arealet(int sidelengde) {
        return sidelengde*sidelengde;

    }

    public double diagonal(int sidelengde) {
        return sidelengde;

    }

    public int omkrets(int sidelengde) {
        return sidelengde*4;

    }

    public void skrivUt() {
        for (int i=0; i < sidelengde; i++) {
            for (int j=0; j < sidelengde; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

}
