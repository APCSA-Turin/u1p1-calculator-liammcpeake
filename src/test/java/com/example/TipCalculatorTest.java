package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    @Test
    void testCalculateTip(){
        TipCalculator calculator = new TipCalculator();
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $52.27\n" +
                                "Total percentage: 25%\n" +
                                "Total tip: $13.07\n" +
                                "Total Bill with tip: $65.34\n" +
                                "Per person cost before tip: $8.71\n" +
                                "Tip per person: $2.18\n" +
                                "Total cost per person: $10.89\n" +
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testCalculateTip2(){
        TipCalculator calculator = new TipCalculator();
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $566.97\n"+
                                "Total percentage: 15%\n"+
                                "Total tip: $85.05\n"+
                                "Total Bill with tip: $652.02\n"+
                                "Per person cost before tip: $47.25\n"+
                                "Tip per person: $7.09\n"+
                                "Total cost per person: $54.33\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }
    
    @Test
    void testCalculateTip3(){
        TipCalculator calculator = new TipCalculator();
        int people = 2;
        int percent = 5;
        double cost = 29.56;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $29.56\n"+
                                "Total percentage: 5%\n"+
                                "Total tip: $1.48\n"+
                                "Total Bill with tip: $31.04\n"+
                                "Per person cost before tip: $14.78\n"+
                                "Tip per person: $0.74\n"+
                                "Total cost per person: $15.52\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testCalculateTip4(){
        TipCalculator calculator = new TipCalculator();
        int people = 1;
        int percent = 20;
        double cost = 15.00;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $15.0\n"+
                                "Total percentage: 20%\n"+
                                "Total tip: $3.0\n"+
                                "Total Bill with tip: $18.0\n"+
                                "Per person cost before tip: $15.0\n"+
                                "Tip per person: $3.0\n"+
                                "Total cost per person: $18.0\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testCalculateTipZeroPercent(){
        TipCalculator calculator = new TipCalculator();
        int people = 4;
        int percent = 0;
        double cost = 40.00;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $40.0\n"+
                                "Total percentage: 0%\n"+
                                "Total tip: $0.0\n"+
                                "Total Bill with tip: $40.0\n"+
                                "Per person cost before tip: $10.0\n"+
                                "Tip per person: $0.0\n"+
                                "Total cost per person: $10.0\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testCalculateTipHighPercent(){
        TipCalculator calculator = new TipCalculator();
        int people = 3;
        int percent = 30;
        double cost = 75.50;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $75.5\n"+
                                "Total percentage: 30%\n"+
                                "Total tip: $22.65\n"+
                                "Total Bill with tip: $98.15\n"+
                                "Per person cost before tip: $25.17\n"+
                                "Tip per person: $7.55\n"+
                                "Total cost per person: $32.72\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testCalculateTipSmallCost(){
        TipCalculator calculator = new TipCalculator();
        int people = 2;
        int percent = 18;
        double cost = 5.99;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $5.99\n"+
                                "Total percentage: 18%\n"+
                                "Total tip: $1.08\n"+
                                "Total Bill with tip: $7.07\n"+
                                "Per person cost before tip: $3.0\n"+
                                "Tip per person: $0.54\n"+
                                "Total cost per person: $3.53\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testExtraCredit1(){
        TipCalculator calculator = new TipCalculator();
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $52.27\n" +
                                "Total percentage: 25%\n" +
                                "Total tip: $13.07\n" +
                                "Total Bill with tip: $65.34\n" +
                                "Per person cost before tip: $8.71\n" +
                                "Tip per person: $2.18\n" +
                                "Total cost per person: $10.89\n" +
                                "-------------------------------\n";
        expectedOutput+="Items ordered:\n"+
                        "Burger\nFries\n"+
                        "-------------------------------\n";
        String simulatedInput = "Burger\nFries\n-1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        String result = TipCalculator.extraCredit(6,25,52.27);


        assertEquals(result,expectedOutput);
    }

    @Test
    public void testExtraCredit2(){
        TipCalculator calculator = new TipCalculator();
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $566.97\n"+
                                "Total percentage: 15%\n"+
                                "Total tip: $85.05\n"+
                                "Total Bill with tip: $652.02\n"+
                                "Per person cost before tip: $47.25\n"+
                                "Tip per person: $7.09\n"+
                                "Total cost per person: $54.33\n"+
                                "-------------------------------\n";
        expectedOutput+="Items ordered:\n"+
                        "-------------------------------\n";
        String simulatedInput = "-1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        String result = TipCalculator.extraCredit(12,15,566.97);


        assertEquals(result,expectedOutput);
    }
}
