package com.company;

public class oppgave1u39 {


    private static boolean[][] aud =
            {
                    { false, false, false, false}, // rad 0
                    { false, false, true,  false}, // rad 1
                    { true,  false, true,  true }, // rad 2
                    { true,  true,  true,  true }, // rad 3
            };

    private static boolean[][] aud2 =
            {
                    { false, false, false, false}, // rad 0
                    { false, false, true,  false}, // rad 1
                    { false,  true, false,  true }, // rad 2
                    { false,  false,  false,  false }, // rad 3
            };

    private static boolean[][] aud3 =
            {
                    { true, false, true, false}, // rad 0
                    { true, false, true,  false}, // rad 1
                    { true,  true, true,  true }, // rad 2
                    { true,  false,  true,  false }, // rad 3
            };


    public static void ledigePlasser(boolean[][] aud) {

        int plasserLedige = 0;
        for (int i = 0; i < aud.length; i++) {
            for (int j = 0; j < aud[i].length; j++) {

                if (aud[i][j] == false) {
                    plasserLedige += 1;

                }



            }
        }
        System.out.println("Det er totalt " + plasserLedige + " plasser ledige");


    }

    public static void prosentDel(boolean[][] aud) {
        double totalPlasser = 0;
        double plasserLedige = 0;
        for (int i = 0; i < aud.length; i++) {
            for (int j = 0; j < aud[i].length; j++) {

                if (aud[i][j] == true) {
                    plasserLedige += 1;

                }

                if (aud[i][j] == false || aud[i][j] == true) {
                    totalPlasser += 1;
                }

            }
        }
        double prosentPlasser = (plasserLedige/totalPlasser)*100;

        System.out.println(prosentPlasser + "% av plassene er opptatte");

    }

    public static void førsteLedigePlassFraToppen(boolean[][] aud2) {
        int ledigrad =0;
        for (int i = 0; i < aud2.length; i++) {
            for (int j = 0; j < aud2[i].length; j++) {

                if (aud2[i][j] == true) {
                    ledigrad = j;
                    System.out.println("Den første ledige plass er på rad " + i +  " posisjon " + j);
                    break;
                }

            }
            if (aud2[i][ledigrad] == true) {
                break;
            }
        }
    }


    public static void smitteVern(boolean[][] aud3) {
        boolean smittevern = true;
        for (int i = 0; i < aud3.length; i++) {
            for (int j = 0; j < aud3[i].length; j++) {



                if (aud3[i][j] == true) {

                    if ((aud3[i][j+1] == true || aud3[i][j-1] == true)) {
                        System.out.println("det er ikke smittevern på rad " + i);
                    }
                }




            }

        }

    }







    public static void main(String[] args) {
        ledigePlasser(aud);
        prosentDel(aud);
        førsteLedigePlassFraToppen(aud2);
        smitteVern(aud3);
    }

}
