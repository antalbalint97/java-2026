import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hogy hívnak? ");
        String nev = scanner.nextLine();

        koszontes(nev);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Szám: " + i);
        }

        scanner.close();
    }

    public static void koszontes(String nev) {
        System.out.println("Szia, " + nev + "!");
    }
}