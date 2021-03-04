package javaBasics;

public class SingletonPractice {

    private static SingletonPractice singletonObj = new SingletonPractice();
    String name;
    int age = 0;

    private SingletonPractice() {

    }

    public static SingletonPractice getInstance() {
        return singletonObj;
    }

}
