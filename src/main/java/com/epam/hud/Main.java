package com.epam.hud;

import com.epam.hud.entity.User;
import com.epam.hud.logic.LoanManager;
import com.epam.hud.logic.Manager;
import com.epam.hud.logic.TaxManager;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Petya", "Pupkin", 20, "pupkin@ya.com", 310, 300, 12, 30, 200, 220);
        Manager loanManager = new LoanManager();
        TaxManager taxManager = new TaxManager();
        System.out.println(admin.getName() + " " + admin.getSurname() + "'s loan debt is: " + loanManager.receiveDebt(admin) + "$");
        System.out.println(admin.getName() + " " + admin.getSurname() + "'s Tax debt is: " + taxManager.receiveDebt(admin) + " $");
    }
}
