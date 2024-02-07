package com.cejv416.decisionexample;

/**
 *
 * @author omniprof
 */
public class DecisionExample {

    public void perform() {

        //simpleIf();
        simpleElse();
    }

    /**
     * Basic if
     */
    public void simpleIf() {
        int number = 7;

        System.out.println("simpleIf");
        if (number > 8) {
            System.out.println("Number " + number + " is greater than 8");
        }
    }

    /**
     * Basic else
     */
    public void simpleElse() {
        int number = 9;

        System.out.println("simpleElse");
        if (number > 8) {
            System.out.println("Number " + number + " is greater than 8");
            if (number > 15) {
                System.out.println("Number too large");
            }
        } else if (number < 8) {
            System.out.println("Number " + number + " is less than 8");
            System.out.println("Moose");
        } else {
            System.out.println("Number equal to 8");
        }
    }

    public static void main(String... args) {
        new DecisionExample().perform();
    }

}
