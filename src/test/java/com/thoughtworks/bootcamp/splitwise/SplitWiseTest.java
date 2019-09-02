package com.thoughtworks.bootcamp.splitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitWiseTest {
    @Test
    void givenSpenderTakerWithZeroSpendMoney_WhenCalculateSplit_ThenReturnSplitZero() {
        Person person1=new Person(101,"A",0,0);
        Person person2=new Person(102,"B",0,0);
        Person person3=new Person(103,"C",0,0);
        List<Person> personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Trip trip=new Trip(0,personList,personList.get(0));
        Assertions.assertEquals(0,trip.split());
    }

}