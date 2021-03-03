package javaBasics;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        obj1.setName("Taylor");
        obj2.setName("Salah");
        obj3.setName("Anaam");

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());

        obj2.setName("Alexandra");

        System.out.println("********************");

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());


    }


}
