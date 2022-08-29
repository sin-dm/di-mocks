package domain.details;

public interface Battery {

    void charge(int value);

    void discharge(int value);

    int getCapacity();
}
