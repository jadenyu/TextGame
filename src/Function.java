import java.util.Scanner;

public class Function {

    public static void menuTitle(String title) {
        System.out.println("\nWelcome to");
        for(int i = 0; i < title.length()+2; i++) {
            System.out.print("#");
        }
        System.out.println("\n#" + title + "#");
        for(int i = 0; i < title.length()+2; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static Player newPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        return new Player(name);
    }

    public static void changeName(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your new name: ");
        String name = scanner.nextLine();
        player.setName(name);
    }

    public static void printInformation(Player player) {
        System.out.println("\n   Player Information: ");
        System.out.println("Name: " + player.getName());
    }
}
