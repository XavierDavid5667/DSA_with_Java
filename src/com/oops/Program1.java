package com.oops;

public class Program1 {

    private Parent parent;

    private Child child;

    public Program1(Parent parent, Child child) {
        this.parent = parent;
        this.child = child;
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.eat();
    }
}
