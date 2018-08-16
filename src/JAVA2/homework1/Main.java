package JAVA2.homework1;

public class Main {

    public static void main(String[] args) {
        Ship s = new Ship();
        Car c = new Car();
        Plane p = new Plane();

        System.out.println(s.move());
        System.out.println(c.move());
        System.out.println(p.move());
        System.out.println(c.TransportCargo());
        System.out.println(c.TransportPassangers());
        System.out.println(p.TransportCargo());
        System.out.println(p.TransportPassangers());
        System.out.println(s.TransportCargo());
        System.out.println(s.TransportPassangers());

	// write your code here
    }
}

