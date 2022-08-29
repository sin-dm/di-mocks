package domain.details;

public class CheapEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Cheap engine is started");
    }

    @Override
    public void ride() {
        System.out.println("Cheap engine is riding slow");
    }

    @Override
    public void stop() {
        System.out.println("Cheap engine is stopped");
    }
}
