public interface Engine {

    void start() throws BatteryDischargeException;

    void shutdown();

    Boolean getStatus();

}
