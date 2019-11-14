import java.util.Scanner;
import java.util.Random;

public class DieDriver {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number that acts as the amount of sides in a dice");
        num = scan.nextInt();
        RollDie die1 = new RollDie(num);
        System.out.println("rolled die that has" + die1.Roll());
        System.out.println("Dice landed at " );

    }
}