package domain.car;

import domain.details.*;

public class SportCar {
    private final Battery battery;
    private final Engine engine;
    private final SportSpoiler spoiler;

    public SportCar(Battery battery, Engine engine, SportSpoiler spoiler) {
        this.battery = battery;
        this.engine = engine;
        this.spoiler = spoiler;
    }

    public int test() {
        engine.start();
        battery.discharge(100);
        engine.ride();
        battery.charge(2 * spoiler.getMultiplier());
        engine.stop();
        return battery.getCapacity();
    }
}
