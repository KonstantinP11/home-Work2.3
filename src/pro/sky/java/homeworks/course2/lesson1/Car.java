package pro.sky.java.homeworks.course2.lesson1;

public class Car extends motorVehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void service() {
        super.service();
    }
}