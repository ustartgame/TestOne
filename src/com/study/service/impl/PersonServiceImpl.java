package com.study.service.impl;

import com.study.service.PersonService;

public class PersonServiceImpl implements PersonService {
    public int money = 100;

    @Override
    public void saveMoney(int in) {
        this.money = in + this.money;

    }

    @Override
    public void outMoney(int out) {
        this.money = this.money - out;
        if (this.money <= 0) {
            this.money = 0;
        }
    }
}
