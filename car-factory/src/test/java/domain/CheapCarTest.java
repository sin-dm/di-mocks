package domain;

import com.sun.source.tree.ModuleTree;
import domain.car.CheapCar;
import domain.details.*;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class CheapCarTest {

    @Mock
    CheapBattery battery;

    @Mock
    CheapEngine engine;

    @Mock
    CheapSpoiler spoiler;

    @Test
    public void testCarTest() {
        MockitoAnnotations.openMocks(this);
        CheapCar cheapCar = new CheapCar(battery, engine);
        Mockito.when(battery.getCapacity()).thenReturn(99999);
        int cap = cheapCar.test();
        assertEquals(99999, cap);
    }

    @Test
    public void testCarWithSpoiler() {
        MockitoAnnotations.openMocks(this);
        CheapCar cheapCar = new CheapCar(battery, engine);
        assertEquals(208, cheapCar.test());
    }
}
