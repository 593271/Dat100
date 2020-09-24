public class oppgave3cu39 {

    private static int[][] matrise = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static int[][] skaler(int tall, int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                int multi = (matrise[i][j]) * tall;
                System.out.print(multi + " ");
            }
            System.out.println();
        }
        return matrise;
    }




        public static void main (String[]args){
            skaler(8, matrise);
        }


}
