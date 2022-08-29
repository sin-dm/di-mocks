package domain.details;

public class CheapBattery implements Battery {

    private int capacity;

    public CheapBattery(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void charge(int value) {
        capacity += value;
    }

    @Override
    public void discharge(int value) {
        capacity -= value;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
