package pro.sky.java.homeworks.course2.lesson1;

public class ServiceStation implements Service {
    @Override
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        if (vehicle.getModelName().startsWith("car") || vehicle.getModelName().startsWith("truck")) {
            checkEngine();
        }
        if (vehicle.getModelName().startsWith("truck")) {

            checkTrailer();
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
