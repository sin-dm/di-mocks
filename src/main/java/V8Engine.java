public class V8Engine implements Engine {

    private Boolean isStarted = false;
    private Battery battery;

    @Override
    public void start() throws BatteryDischargeException {
        if (battery.getCapacity() > 0) {
            isStarted = true;
        } else {
            throw new BatteryDischargeException("Батарея разряжена");
        }
    }

    @Override
    public void shutdown() {
        isStarted = false;
    }

    @Override
    public Boolean getStatus() {
        return isStarted;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
