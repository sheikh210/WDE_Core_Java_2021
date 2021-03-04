package oops.abstraction;

public class LearnAbstraction extends LearnAbstractClasses {

    /*
     Abstraction - Hiding complex/sensitive functionality from end-user
        This can be done by hiding methods/variables and wrapping them in overridden functionality
     */

    @Override
    public void doSomething(int x){
        System.out.println("Doing something -- x = " + x);
    }

    @Override
    public void doSomething2(){
        System.out.println("Doing something 2");
    }

    @Override
    public void doSomething3(){
        System.out.println("Doing something 3");
    }
}

