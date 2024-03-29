package com.thoughtworks.bootcamp.splitwise;

import java.util.List;

public class Trip implements Expenditure {
    Person spender;
    float spendMoney;
    List<Person> taker;

    Trip(float spendMoney, List<Person> taker, Person spender) {
        this.spender=spender;
        this.taker =taker;
        this.spendMoney=spendMoney;
    }

    public float split() {
        float splitMoney=spendMoney/taker.size();
        return splitMoney;
    }

    @Override
    public boolean updateGetGivesForAll(float splitMoney) {
        if(splitMoney==0) {
            return false;
        }
        float get=spendMoney-splitMoney;
        spender.gets=get;
        for(Person p:taker) {
            p.gives=splitMoney;
        }
        return true;
    }

    @Override
    public boolean updateGetGivesForSelected(float splitMoney) {
        if(splitMoney==0) {
            return false;
        }
        float get=spendMoney-splitMoney;
        spender.gets=get;
        for(Person p:taker) {
            p.gives=splitMoney;
        }
        return true;
    }



}
