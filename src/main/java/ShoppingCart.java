import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int numItems = scan.nextInt();
        double total = 0;

        for (int i = 1; i <= numItems; i++) {
            System.out.print("Price of item " + i + "? ");
            total += scan.nextDouble();
        }
        System.out.println("Your cart has " + numItems + " items with a total cost of $" + total);
    }
}
