package com.thoughtworks.bootcamp.splitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitWiseTest {

    Person person1=new Person(101,"A",0,0);
    Person person2=new Person(102,"B",0,0);
    Person person3=new Person(103,"C",0,0);
    Trip trip1;
    List<Person> personList;
    @BeforeEach
    void setUp(){
        personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        trip1=new Trip(0,personList,personList.get(0));

    }
    @Test
    void givenSpenderTakerWithZeroSpendMoney_WhenCalculateSplit_ThenReturnSplitZero() {
        Assertions.assertEquals(0,trip1.split());
    }

    @Test
    void givenSpenderTakerWithThreeSpendMoney_WhenCalculateSplit_ThenReturnSplitOne() {
        Trip trip=new Trip(3,personList,personList.get(0));
        Assertions.assertEquals(1,trip.split());
    }

    @Test
    void givenSpenderSpecifiedTakerWithTwoSpendMoney_WhenCalculateSplit_ThenReturnSplitOne() {
        List<Person> personList=new ArrayList<>();
        personList.add(person2);
        personList.add(person3);
        Trip trip=new Trip(2,personList,person1);
        Assertions.assertEquals(1,trip.split());
    }

    @Test
    void givenSplitMoneyZeroForAll_WhenUpdateList_ThenReturnFalse() {
        Assertions.assertFalse(trip1.updateGetGivesForAll(0.0f));
    }

    @Test
    void givenSplitMoneyOneForAll_WhenUpdateList_ThenReturnTrue() {
        Assertions.assertTrue(trip1.updateGetGivesForAll(1.0f));
    }

    @Test
    void givenSplitMoneyZeroForSelected_WhenUpdateList_ThenReturnFalse() {
        Assertions.assertFalse(trip1.updateGetGivesForSelected(0.0f));
    }

    @Test
    void givenSplitMoneyOneForSelected_WhenUpdateList_ThenReturnTrue() {
        Assertions.assertTrue(trip1.updateGetGivesForSelected(1.0f));
    }
}
