import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void Menu(ArrayList<String> options, Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Function.menuTitle("New World Text Game");
            System.out.println("\nPlease select an option: ");
            for (int i = 0; i < options.size(); i++) {
                int index = i + 1;
                System.out.println(index + ". " + options.get(i));
            }
            System.out.print("You choose: ");
            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1 -> Story.story1();
                case 2 -> Function.changeName(player);
                case 3 -> Function.printInformation(player);
                case 4 -> {
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                }
                default -> System.out.println("You enter an invalid option, please try again. ");
            }
        }
    }

    public static void main(String[] args) {

        Player p1 = Function.newPlayer();

        ArrayList<String> options = new ArrayList<>();
        options.add("Start Game");
        options.add("Change your name");
        options.add("Check your information");
        options.add("Exit");

        Menu(options,p1);
    }
}
