package domain.details;

public class SportEngine implements Engine{

    private int oilCount;

    public SportEngine(int oilCount) {
        this.oilCount = oilCount;
    }

    @Override
    public void start() {
        System.out.println("Engine is started");
    }

    @Override
    public void ride() {
        System.out.println("Engine is riding");
    }

    @Override
    public void stop() {
        System.out.println("Engine is stopped");
    }
}
