public interface Battery {

    void discharge(Integer amper);

    void charge(Integer amper);

    Integer getCapacity();

}
