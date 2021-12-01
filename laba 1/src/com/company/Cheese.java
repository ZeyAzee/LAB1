package com.company;

public class Cheese extends Food{
    public Cheese(){
        super("сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }
}
