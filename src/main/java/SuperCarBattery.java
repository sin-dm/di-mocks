public class SuperCarBattery implements Battery {

    private Integer chargeCapacity = 100;

    @Override
    public void discharge(Integer amper) {
        chargeCapacity = chargeCapacity - amper;
    }

    @Override
    public void charge(Integer amper) {
        chargeCapacity = chargeCapacity + amper;
    }

    @Override
    public Integer getCapacity() {
        return chargeCapacity;
    }
}
