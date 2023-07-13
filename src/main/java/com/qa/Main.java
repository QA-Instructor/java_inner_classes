package com.qa;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        memberClassDemo();
//        localClassDemo();
//        anonymousClassDemo();
        nestedClassDemo();
    }


    public static void memberClassDemo(){
        //        Referring to member inner classes
//        If the member class is public you must use the outer class name as a prefix

//        instantiate the outer object
        Bank aBank = new Bank();

//        Could use this syntax to create an instance of the Bank Iterator
//        BankIterator accountIterator = aBank.new BankIterator();

//        Instead create a public method in Bank to expose the iterator instance
        Bank.BankIterator bankAccountIterator = aBank.getBankIterator();
        System.out.println("Are there more accounts? " + bankAccountIterator.hasNext());

        System.out.println("Each inner object must be created through an outer object");
        System.out.println("Each inner object has access to members of the outer object");
        System.out.println("Each inner object keeps a reference to its outer object");

        System.out.println("The BankIterator member class can return the instance of its outer object, the Bank");
        System.out.println(bankAccountIterator.getOuterObjectReference());
    }
    public static void localClassDemo(){
        OuterClassWithLocalInnerClass outer = new OuterClassWithLocalInnerClass();
        outer.localMethod();
    }

    public static void anonymousClassDemo(){
        AnonymousInnerClassDemo outer = new AnonymousInnerClassDemo();
        outer.useAGreetableClass();
    }

    public static void nestedClassDemo(){
        Account lisaAccount = new Account(1);
        Account bartAccount = new Account(2);

        Account.AccountIDComparer comparer = new Account.AccountIDComparer();
        int result = comparer.compare(lisaAccount, bartAccount);
        System.out.println(result);
        displayComparisonResults(result);

        Account lisaAccountCopy = lisaAccount;
        result = comparer.compare(lisaAccount, lisaAccountCopy);
        System.out.println(result);
        displayComparisonResults(result);

    }

    private static void displayComparisonResults(int result) {
        if (result < 0){
            System.out.println("The first account has a lower ID number than the second");
        }
        else if (result == 0){
            System.out.println("The two accounts are the same account");
        }
        else {
            System.out.println("The first account has a higher ID number than the second");
        }
    }
}