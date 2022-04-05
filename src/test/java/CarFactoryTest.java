import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarFactoryTest {

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    SuperCarBattery battery;

    @Mock
    ExternalService service;

    @Test(expected = BatteryDischargeException.class)
    public void createCar() throws BatteryDischargeException {
        //Проверить что батарея разряжается
        MuscleCar car = new MuscleCar(new V8Engine(), battery);
        Mockito.when(service.request()).thenReturn(new User(10));
        //Mockito.verify(battery, Mockito.times(3)).discharge(90);
        Mockito.when(battery.getCapacity()).thenReturn(-100);
        car.ride();
    }
}
