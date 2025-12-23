package gr.aueb.cf.cf9.cha6;

/**
 * Ορίζει ένα 2D array και κάνει populate
 * τον πίνακα. 2D arrays ορίζονται ως [γραμμή][στήλη]
 */
public class ArrayTwoDim {
    public static void main(String[] args) {

        int[][] grid = new int[2][3];
        int[][] grid2 = {
                {1, 1, 3},
                {2, 3, 8},
                {4, 1, 443}
        };

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;


        for(int i = 0; i < grid.length; i++ ){
            for (int j = 0; j < grid[i].length; j++ ){
                  System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for(int[]row: grid2){
            for (int el : row){
                System.out.print(el+ " ");
            }
            System.out.println();
        }



    }
}
