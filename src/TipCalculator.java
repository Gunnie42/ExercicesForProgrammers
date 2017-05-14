//
// TipCalculator
//

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the bill amount?");
        double billAmount = sc.nextDouble();

        System.out.println("What is the tip rate?");
        int tipRate = sc.nextInt();

        double tip = billAmount * (tipRate / 100.);
        tip = Math.round(tip * 100) / 100;

        double total = billAmount + tip;

        System.out.println("Tip : " + tip);
        System.out.println("Total : " + total);

    }
}

