package com.qa;

import java.util.Iterator;

//Bank is a class that contains a member inner class called BankIterator
public class Bank {

    public String toString(){
        return "I am a Bank";
    }
    private Account[] accounts;
    private int numberOfAccounts;

    private BankIterator bankIterator = new BankIterator();

//    public getter of Bank that returns the BankIterator
    public BankIterator getBankIterator(){
        return bankIterator;
    }

//    this is a member inner class
    public class BankIterator implements Iterator {
        int cursor = 0;

        @Override
        public boolean hasNext() {
//            inner member classes have access to the outer classes' private variables etc
//            Member classes can use the same access modifiers as variables and methods
//            including private, protected and default
//            numberOfAccounts is accessible without a prefix of the class name

            return cursor < numberOfAccounts;
        }

        @Override
        public Object next() {
            return null;
        }

//        method to demonstrate that each inner class has access to its outer class
        public Bank getOuterObjectReference(){
//            prefix the method with the outer class name
//            this inner member class can explicitly refer to its creator
                return Bank.this;
        }

    }
}
