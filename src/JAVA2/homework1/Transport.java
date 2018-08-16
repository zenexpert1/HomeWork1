package JAVA2.homework1;

public abstract class Transport {

    int getSpeed() {
        return speed;
    }

    private int speed;
    private int width;
    private int length;
    private int height;


    Transport(int speed, int width, int length, int height) {
        this.speed = speed;
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public abstract String move();
}







