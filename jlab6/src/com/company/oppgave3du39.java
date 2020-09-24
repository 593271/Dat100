package com.company;

public class oppgave3du39 {

    private static int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    private static int[][] mat2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};



    public static boolean erLik(int[][] mat1, int[][] mat2) {
        boolean like = true;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {


                if (mat1.length != mat2.length) {
                    like = false;
                } else if (mat1[i][j] != mat2[i][j]){
                    like = false;

                }


            }
        }
        System.out.println(like);
        return like;
    }





    public static void main(String[] args) {
            erLik(mat1,mat2);
    }

}
