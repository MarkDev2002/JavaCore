package TestMap;

import java.io.IOException;

public class Menu {
    private static String[] ops = {
            "Add Word",
            "Delete Word",
            "Translate Word",
            "Exit"
    };

    public static void display() throws IOException {
        Dictionary d = new Dictionary();
        int choice;

        do {
            for (int i = 0; i < ops.length; i++) {
                System.out.println((i + 1) + " . " + ops[i]);
            }
            choice = Validation.getInt("Choose : ", 1, ops.length);
            switch (choice) {
                case 1 -> d.addWord();
                case 2 -> d.removeWord();
                case 3 -> d.translate();
                case 4 -> System.exit(0);
                default -> System.out.println("Error!!");
            }
        } while (choice != ops.length);

    }
}
