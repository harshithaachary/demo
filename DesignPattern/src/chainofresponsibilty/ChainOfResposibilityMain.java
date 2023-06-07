package chainofresponsibilty;

import java.util.Scanner;

public class ChainOfResposibilityMain {
    private DispenseChain chain;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw");

        int withdrawAmount = sc.nextInt();

        Rupees500Dispenser d1 = new Rupees500Dispenser();
        Rupees500Dispenser d2 = new Rupees500Dispenser();

        d1.setNextObjectInChain(d2);
    //    d2.setNextObjectInChain(null);
        d1.dispense(new Currency(withdrawAmount));
    }
}
