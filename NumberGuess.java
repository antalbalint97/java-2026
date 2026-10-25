import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int titkosSzam = random.nextInt(20) + 1;

        // TODO: Kérjünk be egy tippet!
        // TODO: Mondjuk meg, kisebb vagy nagyobb!
        // TODO: Ismételjük, amíg el nem találják!
        // TODO: Számoljuk a próbálkozásokat!

        sc.close();
    }
}