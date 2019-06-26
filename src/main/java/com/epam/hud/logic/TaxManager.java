package com.epam.hud.logic;

import com.epam.hud.entity.User;

public class TaxManager implements Manager {
    @Override
    public double receiveDebt(User user) {
        return user.getTaxRest() - user.getTaxPayment();
    }
}
