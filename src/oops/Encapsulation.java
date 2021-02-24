package oops;

public class Encapsulation {

    private String firstName = "George";
    private String lastName = "Odom";
    private int age = 21;
    private long ssn = 924357371;
    private String address = "391 Mulberry Rd., Queens NY 11347";

    /*
    Encapsulation is considered data hiding
        When we don't want to allow the user/other people to change the states/variables of a class
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
