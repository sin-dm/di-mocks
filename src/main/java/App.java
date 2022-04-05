public class App {

    public static void main(String[] args) throws BatteryDischargeException {
        MuscleCar car = new MuscleCar(new V8Engine(), new SuperCarBattery());
        car.playMusic();
        car.playMusic();
        car.ride();
    }
}
