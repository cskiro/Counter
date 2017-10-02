/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.util.Scanner;

/**
 * Chapter 5 Project 2
 *
 * Define a class called Counter. Object records a count that is nonnegative.
 * Include methods to increase and decrease the count. Be sure that method
 * allows the counter to become negative.
 *
 * @author skiroc
 */
public class Counter {

    private int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instance variables 
        Scanner kb = new Scanner(System.in);
        Counter counter = new Counter();
        String response = "";

        System.out.print("Press the '+' symbol to increase the count, \n"
                + " the '-' symbol to decrease the count, \n"
                + " the '#' to set the count back to 0, \n"
                + " or 'x' to quit the program. \n");

        while (!response.equals("x")) {
            response = kb.next();
            
            if (response.equals("+")) {
                counter.increaseCount();
            } else if (response.equals("-")) {
                counter.decreaseCount();
            } else if (response.equals("#")) {
                counter.setCountToZero();
            } else {
                System.out.println("You pressed an invalid key, please try again:");
            }
            System.out.print(counter.getCount() + "\n");
            response = kb.nextLine();
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCountToZero() {
        count = 0;
    }

    public void increaseCount() {
        count++;
    }

    public void decreaseCount() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("A negative number is not allowed.");
        }
    }

}
