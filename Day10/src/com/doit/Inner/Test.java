package com.doit.Inner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner ass = new Outer().new Inner();
        ass.method();

    }
}
