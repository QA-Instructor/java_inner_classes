package com.qa;

public class OuterClassWithLocalInnerClass {
//    a local inner class is analogous to a local variable
//    It is created within a local method and can only be instantiated within the local method
private String s3 = "three";
    public void localMethod(){
        final String s1 = "one";
        String s2 = "two";

//        local inner class, within the local method
        class LocalInner {
            public void displayStrings(){
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
            }
        }
        LocalInner local = new LocalInner();
        local.displayStrings();
    }
}
