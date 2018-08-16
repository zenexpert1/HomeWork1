package JAVA2.homework1;

public class Plane extends Transport implements PassangersAuto,CargoAuto {


    private int the_size_of_the_wings; //площадь крыла


    Plane(){
        super(10,10,17,10);
    }

    @Override
    public String move() {
        return "самолёт полетел над облаками";
    }

    @Override
    public String TransportPassangers() {
        return "Самолёт полетел с пассажирами";
    }
}
