import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("вы ввели число 1");
        int num1 = in.nextInt();
        System.out.println("вы ввели число 2");
        sumAplusB(num, num1);
        System.out.println(sumAplusB(num, num1));

    }

    public static int sumAplusB(int num, int num1) {
        int c = num + num1;

        return c;


    }
}