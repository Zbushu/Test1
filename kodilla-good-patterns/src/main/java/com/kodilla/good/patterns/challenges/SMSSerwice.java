package com.kodilla.good.patterns.challenges;

public class SMSSerwice implements InformationService {
    @Override
    public void informUser(User user) {
        System.out.println("Sending SMS with order information...");
    }
}
