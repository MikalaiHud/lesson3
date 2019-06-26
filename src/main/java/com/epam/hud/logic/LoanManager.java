package com.epam.hud.logic;

import com.epam.hud.entity.User;

public class LoanManager implements Manager {
    @Override
    // Расчет задолженности по кредиту.
    public double receiveDebt(User user) {
        return user.getLoanRest() + user.getLoanRest() * user.getLoanPercent() * user.getLoanDays()/100 - user.getLoanPayment() ;
    }
}
