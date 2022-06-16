package tutorials;
import java.util.Scanner;

public class LoopsTutorial {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                System.out.println("Found it at index " + i);
            }
        }

        int counter = 0;
        for (int element:arr) {
            System.out.println(element + " " + counter);
            counter++;
        }

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a Name: ");
            String name = sc.nextLine();
            names[i] = name;
        }

        for (String n:names) {
            System.out.println(n);
        }
    }
}
