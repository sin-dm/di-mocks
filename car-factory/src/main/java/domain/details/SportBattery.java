package domain.details;

public class SportBattery implements Battery {

    private int capacity;
    private String brandName;

    public SportBattery(int capacity, String brandName) {
        this.capacity = capacity;
        this.brandName = brandName;
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
