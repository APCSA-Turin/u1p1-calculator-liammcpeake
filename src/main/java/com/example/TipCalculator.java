package com.example;
import java.util.Scanner;

public class TipCalculator {

    // round half-up to 2 decimals
    private static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }

    public static String calculateTip(int people, int percent, double cost) {
        // compute unrounded values
        double tip = (percent * cost) / 100.0;
        double total = cost + tip;

        // per-person values computed from unrounded numbers then rounded for display
        double perPersonCost = cost / people;
        double perPersonTip = tip / people;
        double perPersonTotal = total / people;

        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------\n");
        // "Total bill before tip" uses the original cost representation
        sb.append("Total bill before tip: $").append(String.valueOf(cost)).append("\n");
        sb.append("Total percentage: ").append(percent).append("%\n");
        sb.append("Total tip: $").append(String.valueOf(round2(tip))).append("\n");
        sb.append("Total Bill with tip: $").append(String.valueOf(round2(total))).append("\n");
        sb.append("Per person cost before tip: $").append(String.valueOf(round2(perPersonCost))).append("\n");
        sb.append("Tip per person: $").append(String.valueOf(round2(perPersonTip))).append("\n");
        sb.append("Total cost per person: $").append(String.valueOf(round2(perPersonTotal))).append("\n");
        sb.append("-------------------------------\n");

        return sb.toString();
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = calculateTip(people, percent, cost);
        StringBuilder items = new StringBuilder();
        items.append("Items ordered:\n");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("-1")) break;
            if (!line.trim().isEmpty()) items.append(line).append("\n");
        }
        items.append("-------------------------------\n");

        return result + items.toString();
    }

    // manual run helper
    public static void main(String[] args) {
        System.out.println(calculateTip(6,25,52.27));
    }
}
