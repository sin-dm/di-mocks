package domain;

import domain.car.CheapCar;
import domain.car.SportCar;
import domain.details.*;

import java.util.List;

public class Factory {

    public static void main(String[] args) {
        SportBattery sportBattery = new SportBattery(500, "Samsung");
        SportEngine engine = new SportEngine(100);
        SportSpoiler spoiler = new SportSpoiler();
        SportCar sportCar = new SportCar(sportBattery, engine, spoiler);

        CheapEngine cheapEngine = new CheapEngine();
        CheapBattery cheapBattery = new CheapBattery(300);
        CheapSpoiler cheapSpoiler = new CheapSpoiler();
        CheapCar cheapCar = new CheapCar(cheapBattery, cheapEngine);
        cheapCar.setSpoiler(cheapSpoiler);

        System.out.println(sportCar.test());
        System.out.println(cheapCar.test());
    }
}
