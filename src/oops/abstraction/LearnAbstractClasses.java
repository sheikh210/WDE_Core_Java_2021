package oops.abstraction;

public abstract class LearnAbstractClasses {

    /*
    An abstract class is meant to be inherited by a child class
        It contains abstract methods (no body), that are meant to be over-ridden by the child class
        An abstract class can ALSO contain non-abstract methods - This is why abstract classes are not 100% abstract
     */

    // Abstract Method (containing no body)
    public abstract void doSomething(int x);

    public abstract void doSomething2();

    public abstract void doSomething3();

    // Regular (Concrete) Method
    public void doAnotherThing() {
        System.out.println("Doing another thing");
    }



}
