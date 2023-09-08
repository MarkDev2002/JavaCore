package TestMap;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (min <= n && n <= max) {
                    return n;
                }
                System.out.println("Please input a number in range " + min + " -> " + max);
            } catch (NumberFormatException e) {
                System.out.println("Wrong Format!!");
            }
        }
    }

    public static String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Emtpy string not allow");
        }
    }

    public static boolean getYN(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("y")) {
                return true;
            } else if (s.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Input only Y/N!!");
        }
    }
}
