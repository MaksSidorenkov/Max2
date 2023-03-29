import java.util.Scanner;

public class Medium1 {

    public static void main(String[] args) {
       // method1();
        method2();
      //  method3();
    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("ввел 1 число" + num1);
        int num2 = scanner.nextInt();
        System.out.println("ввел 2 число" + num2);
        int sum = num1 - num2;
        System.out.println("summa " + sum);

    }

    static void method2() {
        Scanner scanner1 = new Scanner(System.in);
        float num3 = scanner1.nextFloat();
        System.out.println("ввел 1 число" + num3);
        float num4 = scanner1.nextFloat();
        System.out.println("ввел 2 число" + num4);
        float sum = num3 + num4;
        System.out.println("summa " + sum);

    }

    public static void method3() {
        Scanner scanner2 = new Scanner(System.in);
        String num5 = scanner2.nextLine();
        System.out.println("ввел 1 число" + num5);
        String num6 = scanner2.nextLine();
        System.out.println("ввел 2 число" + num6);
        String sum = num5 + num6;
        System.out.println("summa " + sum);

    }

}
