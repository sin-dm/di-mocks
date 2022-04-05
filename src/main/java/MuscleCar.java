public class MuscleCar {

    private Engine engine;
    private Battery battery;

    public MuscleCar(Engine engine, Battery battery) {
        if (engine.getClass().equals(V8Engine.class)) {
            ((V8Engine) engine).setBattery(battery);
        }
        this.engine = engine;
        this.battery = battery;
    }

    public void ride() throws BatteryDischargeException {
        engine.start();
        if (engine.getStatus().equals(true)) {
             battery.charge(10);
        }
    }

    public void playMusic() {
        battery.discharge(90);
    }

    public Integer getBatteryStatus() {
        return battery.getCapacity();
    }

}
