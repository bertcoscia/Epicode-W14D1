import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);

        int index;
        int newNum;
        do {
            System.out.println("Choose a number between 1 and 5. Press 0 to exit");
            index = Integer.parseInt(scanner.nextLine());
            if (index > arr.length || index < 0) System.out.println("Number not valid");
            else if (index != 0) {
                System.out.println("Choose a number between 1 and 10");
                newNum = Integer.parseInt(scanner.nextLine());
                if (newNum > 10 || newNum < 1) System.out.println("Number not valid");
                else arr[index - 1] = newNum;
            }
            System.out.println(Arrays.toString(arr));
        } while (index != 0);

    }
}
