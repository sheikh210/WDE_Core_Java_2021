package oops.inheritance;

public class TestCarpetCalculator {

    public static void main(String[] args) {

        Floor floor = new Floor(25, 10);
        Carpet carpet = new Carpet(10);

        Calculator calc = new Calculator(floor, carpet);

        System.out.println("TOTAL COST: $" + calc.getTotalCost()); //$2500
    }
}
