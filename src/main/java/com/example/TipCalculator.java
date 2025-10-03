package com.example;
import java.util.Scanner;

public class TipCalculator {

    // Base tip calculator (NO grocery list here)
    public static String calculateTip(int people, int percent, double cost) { 
        double tip = (percent * cost) / 100.0;
        double tipCost = tip + cost;
        double personCost = cost / people;
        double personTipCost = tipCost / people;
        double personTip = tip / people;

        String result = "-------------------------------\n" +
                "Total bill before tip: $" + (Math.round(cost * 100) / 100.0) + "\n" +
                "Total percentage: " + percent + "%\n" +
                "Total tip: $" + (Math.round(tip * 100) / 100.0) + "\n" +
                "Total Bill with tip: $" + (Math.round(tipCost * 100) / 100.0) + "\n" +
                "Per person cost before tip: $" + (Math.round(personCost * 100) / 100.0) + "\n" +
                "Tip per person: $" + (Math.round(personTip * 100) / 100.0) + "\n" +
                "Total cost per person: $" + (Math.round(personTipCost * 100) / 100.0) + "\n" +
                "-------------------------------\n";

        return result;
    }

    // Extra credit: adds grocery list
    // public static String extraCredit(int people, int percent, double cost) { 
    //     String result = calculateTip(people, percent, cost);
    //     StringBuilder groceryList = new StringBuilder();// I ended up using a string builder that I figured out to do from chat gpt because the other way of adding words to a string wasn't working for me.
    //     groceryList.append("Items ordered:\n");

    //     Scanner sc = new Scanner(System.in);
    //     boolean hasItems = false; 

    //     while (true) { // this sets the while statement to be determined as false later on.
    //         if (!sc.hasNextLine()) break;
    //         String item = sc.nextLine().trim();

    //         if (item.equals("-1")) {
    //             break;// I figured this out on stack overflow
    //         }

    //         hasItems = true;
    //         groceryList.append(item).append("\n");
    //     }

    //     groceryList.append("-------------------------------\n");

    //     result += groceryList.toString();
    //     return result;
    // }

    // Main for manual testing
    public static void main(String[] args) {
        int people = 8;
        int percent = 20;
        double cost = 8;
        System.out.println(calculateTip(people, percent, cost));
        // Uncomment to try grocery list mode
        // System.out.println(extraCredit(people, percent, cost));
    }
}
