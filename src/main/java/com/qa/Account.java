package com.qa;

import java.util.Comparator;

public class Account {
    private int id;

    public Account(int id) {
        this.id = id;
    }

//    nested class example
//    nested classed are inner classes that are created independently of the outer class
//    nested classes are declared STATIC

    public static class AccountIDComparer implements Comparator<Account>{

        @Override
        public int compare(Account a1, Account a2) {
            return a1.id - a2.id;
        }
    }

}
