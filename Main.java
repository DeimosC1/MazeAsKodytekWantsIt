public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 1}, //maze 3
                {0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i][j]==1){
                    System.out.print(" X ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
}
