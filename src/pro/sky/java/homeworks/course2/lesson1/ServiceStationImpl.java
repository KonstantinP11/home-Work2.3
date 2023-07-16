package pro.sky.java.homeworks.course2.lesson1;

public class ServiceStationImpl implements ServiceStation {

    @Override
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.service();
    }
}