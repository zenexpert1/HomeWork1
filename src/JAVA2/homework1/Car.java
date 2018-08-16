package JAVA2.homework1;

public class Car extends Transport implements PassangersAuto,CargoAuto {


    Car(){
            super(10,10,17,10);
    }


    @Override
    public String move() {
        return "автомобиль поехал со скоростью " + this.getSpeed();
    }



    @Override
    public String TransportPassangers() {
        return "автомобиль везёт пассажиров";
    }

}
