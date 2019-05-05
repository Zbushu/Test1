package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        Integer addResult = simpleCalculator.addAToB(5, 5);
        Integer subtractResult = simpleCalculator.subtractAFromB(10, 5);
        if (addResult.equals(5+5)) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }
        if (subtractResult.equals(10-5)) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }
    }
}