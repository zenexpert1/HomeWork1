package JAVA2.homework1;

public class Ship extends Transport implements CargoAuto,PassangersAuto{


    private int displacement;


    //Конструктор
    Ship(){
        super(10,10,17,10);
        displacement = 100;
    }

    public int getDisplacement() {
        return displacement;
    }

    @Override
    public String move() {
        return "корабль поплыл со скоростью " + this.getSpeed();
    }

    @Override
    public String TransportCargo() {
        return "Кораблик поплыл с грузом";
    }

    @Override
    public String TransportPassangers() {
        return "Кораблик поплыл с пассажирами";
    }
}


