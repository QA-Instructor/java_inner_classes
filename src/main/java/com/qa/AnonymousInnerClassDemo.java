package com.qa;

public class AnonymousInnerClassDemo {

//    This method needs an instance of the 'Greetable' interface
    public void displayGreetings(Greetable greeting){
        System.out.println(greeting.greet() + "\nThis is an anonymous inner class being used as a method parameter.");
    }
    public void useAGreetableClass(){

//        create an anonymous class and pass it to the displayGreetings method
        displayGreetings(new Greetable() { // the class has no name, it looks like you are instantiating the interface
//        you need to implement the interface's functionality in the anonymous class
            @Override
            public String greet() {
                return "Hello from an anonymous class";
            }
        });

    }
}
