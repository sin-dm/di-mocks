public class MockBattery implements Battery {

    @Override
    public void discharge(Integer amper) {

    }

    @Override
    public void charge(Integer amper) {

    }

    @Override
    public Integer getCapacity() {
        return 0;
    }
}
