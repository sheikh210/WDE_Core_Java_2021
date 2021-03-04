package javaBasics;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonPractice obj = SingletonPractice.getInstance();
        SingletonPractice obj2 = SingletonPractice.getInstance();

        obj.age = 10;
        obj2.age = 20;

//        System.out.println(obj.age);
//        System.out.println(obj2.age);

        System.out.println(obj);
        System.out.println(obj2);



    }

}
