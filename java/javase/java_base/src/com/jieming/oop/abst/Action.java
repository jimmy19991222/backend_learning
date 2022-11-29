package com.jieming.oop.abst;

// abstract class
// cannot new, only rely on son class to implement
// just a constraint

public abstract class Action {
    public abstract void doSomething();

    public void helper(){
        System.out.println("Help me implement doSomething");
    }
}
