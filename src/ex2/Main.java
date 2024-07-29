package ex2;

import java.util.Scanner;

public class Main {
    public static void kmLiter(int km, int lt) throws ArithmeticException {
        try {
            int result = km / lt;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of km");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert number of lt");
        int lt = Integer.parseInt(scanner.nextLine());
        kmLiter(km, lt);
    }
}
