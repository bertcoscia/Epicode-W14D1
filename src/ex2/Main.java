package ex2;

import java.util.Scanner;

public class Main {
    public static int kmLiter(int km, int lt) throws ArithmeticException {
        return km / lt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Insert number of km");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("Insert number of lt");
            int lt = Integer.parseInt(scanner.nextLine());
            System.out.println(kmLiter(km, lt));
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0");
        } catch (NumberFormatException e) {
            System.err.println("You must type a number");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
