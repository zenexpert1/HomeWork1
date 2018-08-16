package JAVA2.homework1;

public interface CargoAuto {
    default String TransportCargo(){
        return "автомобиль везёт груз";
    }
}
