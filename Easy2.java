import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Easy2 {


    static int[][] max(InputStream is, int x, int y) {
        int[][] array = new int[y][];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < y; i++) {
            array[i] = new int[x];
            for (int j = 0; j < x; j++) {
                array[i][j] = scanner.nextInt();

            }

        }
        return array;
    }

    public static void main(String[] args) {


        int[][] array = max(System.in, 3, 2);
        for (int[] line : array) {
            System.out.println(Arrays.toString(line));
        }

    }
}





