package oops;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation george = new Encapsulation();

        System.out.println(george.getFirstName());
        System.out.println(george.getLastName());
        System.out.println(george.getAge());
        System.out.println(george.getAddress());
        System.out.println(george.getSsn());

        System.out.println(george.getFirstName());

    }


}
