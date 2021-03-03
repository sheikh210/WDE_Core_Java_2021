package javaBasics;

public class SingletonClass {

    private static SingletonClass singletonClass = new SingletonClass();
    private String name;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
