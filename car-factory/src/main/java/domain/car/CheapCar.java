package domain.car;

import domain.details.Battery;
import domain.details.CheapSpoiler;
import domain.details.Engine;


public class CheapCar {

    private final Battery battery;
    private final Engine engine;
    private CheapSpoiler spoiler;


    public CheapCar(Battery battery, Engine engine) {
        this.battery = battery;
        this.engine = engine;
    }

    public CheapCar(Battery battery, Engine engine, CheapSpoiler spoiler) {
        this.battery = battery;
        this.engine = engine;
        this.spoiler = spoiler;
    }

    public void setSpoiler(CheapSpoiler spoiler) {
        this.spoiler = spoiler;
    }

    public int test() {
        engine.start();
        battery.discharge(200);
        engine.ride();
        if (spoiler != null) {
            try {
                battery.charge(2 * spoiler.getMultiplier());
            } catch (Exception e) {

            }
        } else {
            battery.charge(4);
        }
        engine.stop();
        return battery.getCapacity();
    }
}
