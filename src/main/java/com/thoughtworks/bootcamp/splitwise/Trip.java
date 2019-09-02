package com.thoughtworks.bootcamp.splitwise;

import java.util.List;

public class Trip {
    Person spender;
    float spendMoney;
    List<Person> taker;
    float splitMoney;
    //Split split;
    Trip(float spendMoney, List<Person> taker, Person spender) {
        this.spender=spender;
        this.taker =taker;
        this.spendMoney=spendMoney;
    }

    public float split() {
        splitMoney=spendMoney/taker.size();
        return splitMoney;
    }

}
